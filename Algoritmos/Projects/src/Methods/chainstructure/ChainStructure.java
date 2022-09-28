package Methods.chainstructure;
import Programs.*;
public class ChainStructure<E> implements ListTAD<E> {
    private Nodo inicio;
    private int qtelements;
    private class Nodo{
        public Nodo prox;
        public E valor;
        
        public Nodo (E element){
            valor = element; 
            prox = null;
        }
    }
    
    public ChainStructure(){
        inicio = null;
    }
    
    @Override
    public void add(E element) {
        int cont = 0;
        Nodo nodo = inicio;
        while(cont < qtelements-1){
            nodo = nodo.prox;
            cont++;
        }
        nodo.prox = new Nodo(element);
        qtelements++;
    }

    @Override
    public void add(int pos, E element) {
        if(pos==0){
            addFirst(element);
        }else if(pos == qtelements){
            addLast(element);
        }else if((pos>0) && (pos < qtelements)){
            int cont = 0;
            Nodo nodo = inicio, aux;
            while(cont < pos-1){
                nodo = nodo.prox;
                cont++;
            }
            aux = nodo.prox;
            nodo.prox = new Nodo(element);
            nodo = nodo.prox;
            nodo.prox = aux;
            qtelements++;
        }
    }

    @Override
    public boolean remove(int pos) {
        if(pos==0){
            removeFirst();
            return true;
        }else if(pos == qtelements-1){
            removeLast();
            return true;
        }else if((pos>0) && (pos<qtelements)){
            int cont = 0;
            Nodo nodo = inicio;
            Nodo aux;
            while(cont < pos-2){
                nodo = nodo.prox;
                cont++;
            }
            aux = nodo.prox;
            nodo.prox = aux.prox;
            qtelements--;
            return true;
        }else return false;
    }

    @Override
    public void remove(E element) {
        int cont =0;
        for(Nodo nodo = inicio; nodo != null; nodo = nodo.prox){
            if (element == nodo.valor){
                remove(cont);
                qtelements--;
            }
            cont++;
        }
    }

    @Override
    public E get(int i) {
        if(i==0){
            return inicio.valor;
        }else if((i>0) && (i<qtelements)){
            int cont = 0;
            Nodo nodo = inicio;
            while(cont < i){
                nodo = nodo.prox;
                cont++;
            }
            return nodo.valor;
        }else throw new Error();
    }

    @Override
    public void set(int index, E element) {
        remove(index);
        add(index, element);
    }

    @Override
    public E search(E element) {
        for(Nodo nodo = inicio; nodo != null; nodo = nodo.prox)
        if (element == nodo.valor) return nodo.valor; 
        return null;  
    }

    @Override
    public int size() {
        return qtelements;
    }

    @Override
    public int count(E element) {
        int cont = 0;
        for(Nodo nodo = inicio; nodo != null; nodo = nodo.prox)
        if (element == nodo.valor) cont++;
        return cont;
    }

    @Override
    public void clean() {
        inicio = null;
        qtelements = 0;
    }

    @Override
    public void addFirst(E element) {
        Nodo nodo = new Nodo(element);
        nodo.prox = inicio;
        inicio = nodo;
        qtelements++;
    }

    @Override
    public void addLast(E element) {
        int cont = 0;
        Nodo nodo = inicio;
        while(cont < qtelements-1){
            nodo = nodo.prox;
            cont++;
        }
        nodo.prox = new Nodo(element);
        qtelements++;
    }

    @Override
    public E getFirst() {
        return inicio.prox.valor;
    }

    @Override
    public E getLast() {
        int cont = 0;
        Nodo nodo = inicio;
        while(cont < qtelements-1){
            nodo = nodo.prox;
            cont++;
        }
        return nodo.valor;
    }

    @Override
    public void removeFirst() {
        int cont = 0;
        Nodo nodo = inicio;
        while(cont < qtelements-1){
            nodo = nodo.prox;
            cont++;
        }
        nodo.prox = null;
        qtelements--;
    }

    @Override
    public void removeLast() {
        int cont = 0;
        Nodo nodo = inicio;
        while(cont < qtelements-1){
            nodo = nodo.prox;
            cont++;
        }
        nodo.prox = null;
        qtelements--;
    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }
}