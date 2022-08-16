public class TabelaDePontuacao {
    private Pontuacao[] linha;
    private int posicao;
    private int codigo;

    public TabelaDePontuacao(int n){
        if(n<20) n = 20;
        linha = new Pontuacao[n];
        posicao = 0;
        codigo = 501;
    }

    public String completaNome(String nome){
        if(nome.length()<13){
            int aux = 13 - nome.length();
            for(int i = 0; i<aux;i++){
                nome = nome + " ";
            }
        }
        return nome;
    }
    
    public boolean inserirTime(String time){
        time = completaNome(time);
        if(posicao<linha.length){
            int cod = codigo++;
            linha[posicao] = new Pontuacao(cod, time);
            posicao++;
            return true;
        }
        else return false;   
    }
    
    public Pontuacao buscaTime(int cod){
        for(int i=0;i<posicao;i++){
            if(linha[i].getCod()==cod){
                return linha[i];
            }
        }
        return null;
    }

    public int buscaIndice(int cod){
        for(int i=0;i<posicao; i++){
            if(linha[i].getCod()==cod) return i;
        }
        return -1;
    } 

    public boolean excluirTime(int cod){
        int ind = buscaIndice(cod);
        if(ind != -1){
            for(int i = ind; i<posicao-1; i++){
                linha[i] = linha[i+1];
            }
            posicao--;
            codigo--;
            linha[posicao] = null;
            return true;
        }
        return false;
    }

    public boolean alteraClube(int cod, String nome){
        int indice = buscaIndice(cod);
        nome = completaNome(nome);
        if(nome != ""){ 
            Pontuacao altera = buscaTime(cod);
            altera.setTime(nome);
            linha[indice] = altera;
            return true;
        }
        return false;
    }
    public void ordenaTabela(){
        Pontuacao aux;
        for(int i=0;i<posicao;i++){
            for(int j=0;j<posicao-1;j++){
                if(linha[j].getP()<linha[j+1].getP()){ 
                    aux = linha[j+1];
                    linha[j+1]= linha[j];
                    linha[j] = aux;
                }
            }
        }
    }

    public void exibeTabela(){
        String a="",b="",c="",d="",e="",f="",g="",h="";
        for(int j= 0 ;j<posicao;j++){
            if(linha[j].getP()/10==0) a = " ";
            if(linha[j].getJ()/10==0) b = " "; 
            if(linha[j].getV()/10==0) c = " "; 
            if(linha[j].getE()/10==0) d = " "; 
            if(linha[j].getD()/10==0) e = " ";
            if(linha[j].getGP()/10==0) f = " "; 
            if(linha[j].getGC()/10==0) g = " "; 
            if(linha[j].getSG()/10==0) h = " "; 
        }
        ordenaTabela();
        String topo = "\n| CÓD |"+"     EQUIPE     |"+"  P  |"+"  J  |"+ "  V  |"+"  E  |"+"  D  |"+"  GP  |" +"  GC  |"+ "  SG  |"+"   %   |";  
        System.out.println(topo);
        for(int i=0;i<posicao;i++){
            String tabela = String.format("  "+linha[i].getCod() +"    "+ linha[i].getTime()+ "   "+linha[i].getP()+a+"    "+linha[i].getJ()+
            b+"    "+linha[i].getV()+c+"    "+linha[i].getE()+d+"    "+linha[i].getD()+e+"     "+linha[i].getGP()+f+"     "+linha[i].getGC()+g+"     "+linha[i].getSG()+h+"     "+(int)linha[i].getAprov()+"\n");
            System.out.println(tabela);
        }
    }
}