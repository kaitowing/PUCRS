package Methods.chainstructure;
public class ChainStructure {
    private Nodo inicio;
    private int qtElements;
    private class Nodo{
        public Nodo prox;
        public String valor;
        
        public Nodo (String val){
            valor = val; 
            prox = null;
        }
    }
    
    public ChainStructure(){
        inicio = null;
    }

    public boolean isEmpty(){
        return inicio == null;
    }
    
    public boolean search(String elem){
        for(Nodo nodo = inicio; nodo != null; nodo = nodo.prox)
        if (elem == nodo.valor) return true; 
        return false;                     
    }

    public int getQtElements() {
        return qtElements;
    }

    public String searchForPlace(int i){
        if(i==0){
            return inicio.valor;
        }else if((i>0) && (i<qtElements)){
            int cont = 0;
            Nodo nodo = inicio;
            while(cont < i){
                nodo = nodo.prox;
                cont++;
            }
            return nodo.valor;
        }else throw new Error();
    }

  public void addFirst(String elem){
        Nodo nodo = new Nodo(elem);
        nodo.prox = inicio;
        inicio = nodo;
        qtElements++;
    }
    
    public void removeFirst(){
        if(inicio != null){
            inicio = inicio.prox;
            qtElements--;
        }
    }

    public void addLast(String elem){
        int cont = 0;
        Nodo nodo = inicio;
        while(cont < qtElements-1){
            nodo = nodo.prox;
            cont++;
        }
        nodo.prox = new Nodo(elem);
        qtElements++;

    }

    public boolean add(int pos, String elem){
        if(pos==0){
            addFirst(elem);
            return true;
        }else if(pos == qtElements){
            addLast(elem);
            return true;
        }else if((pos>0) && (pos < qtElements)){
            int cont = 0;
            Nodo nodo = inicio, aux;
            while(cont < pos-1){
                nodo = nodo.prox;
                cont++;
            }
            aux = nodo.prox;
            nodo.prox = new Nodo(elem);
            nodo = nodo.prox;
            nodo.prox = aux;
            qtElements++;
            return true;
        }
        return false;
    }

    public boolean remove(int pos){
        if(pos==0){
            removeFirst();
            return true;
        }else if(pos == qtElements-1){
            removeLast();
            return true;
        }else if((pos>0) && (pos<qtElements)){
            int cont = 0;
            Nodo nodo = inicio;
            Nodo aux;
            while(cont < pos-2){
                nodo = nodo.prox;
                cont++;
            }
            aux = nodo.prox;
            nodo.prox = aux.prox;
            qtElements--;
            return true;
        }else return false;
    }

    public void removeLast(){
        int cont = 0;
        Nodo nodo = inicio;
        while(cont < qtElements-1){
            nodo = nodo.prox;
            cont++;
        }
        nodo.prox = null;
        qtElements--;
    }
    
    public String exibeLista(){
        if(isEmpty()) return "Lista vazia\n";
        String str = "Lista Encadeada: ";
        for (Nodo nodo = inicio; nodo != null; nodo = nodo.prox)
            str+= " "+ nodo.valor;
        return str + "\n";
    }
}