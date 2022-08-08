package Bar;
public class ListaPessoas {
    private Pessoa[] pessoa;
    private int posicao;

    public ListaPessoas(){
        pessoa = new Pessoa[200];
    }
        public boolean inserirPessoa(Long cpf, int genero, int idade, String nome){
            if(posicao<pessoa.length){
                pessoa[posicao] = new Pessoa(cpf, idade, genero, nome);
                posicao++;
                return true;
            }
            else return false;
        }
    
        public Pessoa buscaPessoa(long cpf){
            for(int i=0;i<posicao;i++){
                if(pessoa[i].getCpf()==cpf){
                    return pessoa[i];
                }
            }
            return null;
        }
    
        public int buscaIndice(long cpf){
            for(int i=0;i<posicao; i++){
                if(pessoa[i].getCpf()==cpf) return i;
            }
            return -1;
        } 
    
        public boolean excluirPessoa(long cpf){
            int ind = buscaIndice(cpf);
            if(ind != -1){
                for(int i = ind; i<posicao-1; i++){
                    pessoa[i] = pessoa[i+1];
                }
                posicao--;
                pessoa[posicao] = null;
                return true;
            }
            return false;
        }
        public void exibePessoas(){
            for(int i=0;i<posicao;i++){
                System.out.println("\n"+pessoa[i]);
            }
        }

        public void informaGenero(){
            int h = 0 , m = 0;
            for(int i=0;i<posicao;i++){
                if((pessoa[i].getGenero()) == "Homem"){
                    h++;
                }else m++;
            }
             double resultado = (h*100)/posicao;
             System.out.println(resultado + "% são homens e "); 
             System.out.println(resultado - 100 +"% são mulheres.");
        }
    
}
