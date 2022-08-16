import java.util.Scanner;
public class Interface {
    public static void main(String[] args) throws Exception {
        int opcao,cod; Scanner in  = new Scanner(System.in); String time;
        int d, m, h, min,esc1,esc2;
        Pontuacao cb1,cb2;
        Partida time1, time2;
        
        System.out.println("\fBem-vindo à tabela do Campeonato Brasileiro!");
        System.out.print("\nInforme o número de equipes que jogarão a temporada: ");
        opcao = in.nextInt();
        
        TabelaDePontuacao tabela = new TabelaDePontuacao(opcao);
        ListaDePartidas lista = new ListaDePartidas(((opcao-1)*2)*opcao/2);
        
        do{
            System.out.println("\n\u25ba \u25ba [MENU] \u25c4 \u25c4  ");
            System.out.println("\n1 - Exibir Tabela");
            System.out.println("2 - Adicionar Equipe");
            System.out.println("3 - Excluir Equipe");
            System.out.println("4 - Alterar Nome de Equipe");
            System.out.println("5 - Marcar Partida");
            System.out.println("6 - Jogar Partida");
            System.out.println("7 - Excluir Partida");
            System.out.println("8 - Exibir Partidas");
            System.out.println("0 - Encerrar Programa");
            System.out.print("\nInforme a opção desejada: ");
            opcao = in.nextInt();
            in.nextLine();
            
            switch(opcao){
                case 1:
                    System.out.print("\f\u25ba TABELA");
                    tabela.exibeTabela(); break;

                case 2:
                    System.out.println("\n\u25ba Adicionar Equipe");
                    System.out.print("Informe o nome da equipe (máx. 13 caracteres): ");
                    time = in.nextLine();
                    while(time.length()>13){
                        System.out.println("\nErro. Nome da equipe excede o máximo de caracteres.");
                        System.out.print("\nInforme o nome da equipe (máx. 13 caracteres): ");
                        time = in.nextLine();
                    }

                    if(tabela.inserirTime(time)==true)
                        System.out.println("\fEquipe adicionada com sucesso.");
                        else System.out.println("Tabela cheia.");
                    tabela.exibeTabela(); 
                    break;

                case 3:
                    System.out.println("\n\u25ba Excluir Equipe");
                    System.out.print("Informe o código da equipe a ser excluída: ");
                    cod = in.nextInt();
                    in.nextLine();
                    if(tabela.excluirTime(cod)==true)
                        System.out.println("\fEquipe excluída com sucesso.");
                    else System.out.println("\fErro. Equipe não encontrada.");    
                    break;
            
                case 4:
                    System.out.println("\n\u25ba Alterar Nome de Equipe");
                    System.out.print("Insira o código da equipe a ser alterada: ");
                    cod = in.nextInt();
                    in.nextLine();
                    if(tabela.buscaTime(cod)!= null){
                        System.out.print("Informe o novo nome da equipe: ");
                        time = in.nextLine();
                        if(tabela.alteraClube(cod, time)==true)
                            System.out.println("\fNome alterado com sucesso.");
                        else System.out.println("\fErro. Nome inalterado.");
                    }else System.out.println("\fErro. Código Inválido."); 
                    break;


                case 5:
                    System.out.println("\n\u25ba Marcar Partida");
                    System.out.println("\nInforme o horário da partida (hora e minuto separadamente).");
                    System.out.print("\nInforme a HORA da partida: ");
                    h = in.nextInt();
                    System.out.print("Insira o(s) MINUTO(s) da partida: ");
                    min = in.nextInt();
                    
                    System.out.println("\nA seguir informe a DATA da partida (apenas números).");
                    System.out.print("Informe o DIA da partida: ");
                    d=in.nextInt();
                    
                    System.out.print("Informe o MÊS da partida: ");
                    m=in.nextInt();
                    
                    System.out.print("\nInforme o código da equipe mandante: ");
                    cod = in.nextInt();
                    if(tabela.buscaTime(cod)!=null){
                        cb1 = tabela.buscaTime(cod);
                        System.out.print("Informe o código da equipe visitante: ");
                        cod = in.nextInt();
                        if(tabela.buscaTime(cod)!=null && tabela.buscaTime(cod)!=cb1){
                            cb2 = tabela.buscaTime(cod);
                            in.nextLine();
                            if(lista.inserirPartida(d, m, h, min, cb1, cb2)==true){ 
                                System.out.println("\fPartida marcada com sucesso.");
                                lista.exibePartida();
                            } 
                            else System.out.println("\fErro. Partida não pôde ser criada.");
                        }
                        else System.out.println("\fErro. Equipe não encontrada.");
                    }else System.out.println("\fErro. Equipe não encontrada.");
                    break;
            
                case 6:
                    System.out.println("\n\u25ba Jogar Partida");
                    System.out.print("\nInforme o código da partida a ser jogada: ");
                    cod = in.nextInt();
                    in.nextLine();
                    if(lista.buscaPartida(cod)!=null){
                        time1 = lista.buscaPartida(cod);
                        cb1 = time1.getClube1();
                        cb2 = time1.getclube2();
                        System.out.print("\nInforme o número de gols marcados pela equipe "+cb1.getTime()+": ");
                        esc1 = in.nextInt();
                        while(esc1<0){
                            System.out.println("\fErro. Informe uma quantia válida.");
                            esc1 = in.nextInt();
                        }
                        System.out.print("Informe o número de gols marcados pela equipe "+cb2.getTime()+": ");
                        esc2 = in.nextInt();
                        while(esc2<0){
                            System.out.println("\fErro. Informe uma quantia válida.");
                            esc1 = in.nextInt();
                        }
                        in.nextLine();
                        if(lista.game(cod, esc1, esc2)==true){
                            System.out.println("\fPartida executada com sucesso.");
                            lista.excluirPartida(cod);
                            tabela.exibeTabela();
                        }
                        else System.out.println("\fnErro. Partida não executada.");}
                    else System.out.println("\fErro. Partida não encontrada.");
                    break;
            
            
                case 7:
                    System.out.println("\n\u25ba Excluir Partida");
                    System.out.print("Informe o código da partida a ser excluída: ");
                    cod = in.nextInt();
                    in.nextLine();
                    if(lista.buscaPartida(cod)!=null){
                        if(lista.excluirPartida(cod)==true)
                            System.out.println("\fPartida excluída com sucesso.");
                        else System.out.println("\fErro. Partida não encontrada.");
                    }
                    else System.out.println("\fErro. Partida não encontrada.");    
                    break;


                case 8:
                    lista.exibePartida();
            }
        }while(opcao != 0);
    }
}