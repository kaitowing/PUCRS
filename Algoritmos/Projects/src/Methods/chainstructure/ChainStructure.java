package Methods.chainstructure;
public class ChainStructure {
    private Nodo inicio;

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

    public Nodo searchForPlace(int i){
        int cont = 0;
        Nodo nodo = inicio;
        while(cont < i){
            nodo = nodo.prox;
            cont++;
        }
        return nodo;
    }

  public void addFirst(String elem){
        Nodo nodo = new Nodo(elem);
        nodo.prox = inicio;
        inicio = nodo;
    }
    
    public void removeInicio(){
        inicio = inicio.prox;
    }
    
    public String exibeLista(){
        if(isEmpty()) return "Lista vazia\n";
        String str = "Lista Encadeada: ";
        for (Nodo nodo = inicio; nodo != null; nodo = nodo.prox)
            str+= " "+ nodo.valor;
        return str + "\n";
    }
}