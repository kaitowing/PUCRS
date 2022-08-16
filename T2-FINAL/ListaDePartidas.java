public class ListaDePartidas{
    private Partida[] lista;
    private int posicao;
    private int codigo;

    public ListaDePartidas(int n){
        lista = new Partida[n];
        codigo = 1;
    }

    public boolean game(int cod, int esc1, int esc2){
        Partida aux;
        int indice = buscaIndice(cod);
        if(indice!=-1){
            aux = buscaPartida(cod);
            if(aux.Game(esc1, esc2)==true){
                lista[indice] = aux;
                return true;
            }
        }return false;
    }

    public boolean inserirPartida(int d,int m,int h,int min,Pontuacao cb1,Pontuacao cb2){
        if(posicao<lista.length){
            int cod = codigo++;
            lista[posicao] = new Partida(d,m,h,min,cb1,cb2,cod);
            posicao++;
            return true;
        }
        else return false;
    }

    public Partida buscaPartida(int cod){
        for(int i=0;i<posicao;i++){
            if(lista[i].getCodigo()==cod){
                return lista[i];
            }
        }
        return null;
    }

    public int buscaIndice(int cod){
        for(int i=0;i<posicao; i++){
            if(lista[i].getCodigo()==cod) return i;
        }
        return -1;
    } 

    public boolean excluirPartida(int cod){
        int ind = buscaIndice(cod);
        if(ind != -1){
            for(int i = ind; i<posicao-1; i++){
                lista[i] = lista[i+1];
            }
            posicao--;
            codigo--;
            lista[posicao] = null;
            return true;
        }
        return false;
    }

    public void exibePartida(){
        for(int i=0;i<posicao;i++){
            System.out.println("\n"+lista[i]);
        }
    }
}