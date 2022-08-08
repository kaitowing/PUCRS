package Bar;
import java.util.*;
public class Bar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bem-Vindo!");
        int idade,genero;
        Long cpf;
        String nome;
        int opcao;
        ListaPessoas lista = new ListaPessoas();
        do{

            System.out.println("O que deseja fazer?");
            System.out.println("1 -- Nova entrada de cliente --");
            System.out.println("2 -- Quantos clientes estão no bar --");
            System.out.println("3 -- Qual a distribuição por gênero --");
            System.out.println("4 -- Saída de cliente do bar- --");
            System.out.println("0 -- Finalizar o programa --");
            opcao = in.nextInt();
            switch(opcao){
               case 1:
                System.out.println("Informe os dados do cliente.");
                System.out.println("Informe o cpf:");
                cpf = in.nextLong();
                System.out.println("Informe a idade:");
                idade =in.nextInt();
                System.out.println("Informe o genero:");
                System.out.println("1 - Para homem.");
                System.out.println("2 - Para mulher.");
                genero = in.nextInt();
                in.nextLine();
                System.out.println("Informe o nome:");
                nome = in.nextLine();
                lista.inserirPessoa(cpf, genero, idade, nome); break;
              case 2:
                lista.exibePessoas(); break;

              case 3:
                lista.informaGenero(); break;

              case 4:
                System.out.println("Para sair do bar insira seu cpf:");
                cpf = in.nextLong();
                lista.excluirPessoa(cpf);
            }
        }while(opcao!= 0);   
        System.out.println("Encerrando...");
    }
}
