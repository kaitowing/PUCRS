package Bar;
public class Pessoa {
    private Long cpf;
    private int idade;
    private int genero;
    private String nome;

    public Pessoa(Long c, int i, int g, String n){
        cpf = c;
        idade = i;
        genero = g;
        nome = n;
    }
    
    public String toString() {
        String a = "Nome: " + nome + "\n Cpf: " + cpf + "\n Genero: " + getGenero() + "\n Idade: " + idade;
        return a ;
    }

    /**
     * @return int return the cpf
     */
    public Long getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return String return the genero
     */
    public String getGenero() {
        if(genero == 1) return "Homem";
        else return "Mulher";
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(int genero) {
        this.genero = genero;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
