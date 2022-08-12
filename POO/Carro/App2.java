import java.util.*;
public class App2 {
    public static void main(String[] args) {
        int opcao, litros;
        Random rand = new Random();
        String cod = "ABC" + (rand.nextInt(8999)+1000);
        Scanner in = new Scanner(System.in);
        Veiculo[] carros = new Veiculo[5];
        Placa[] placas = new Placa[5];
        for (int i = 0; i < placas.length; i++) {
            placas[i] = new Placa("Brasil", cod);
            cod = "ABC"+(rand.nextInt(8999)+1000);
        }

        for (int i = 0; i < carros.length; i++) {
            carros[i] = new Veiculo(placas[i]);
        }

        do{
            for (int i = 0; i < placas.length; i++) {
                System.out.println(carros[i]);
            }
            System.out.println("\n-----------------------------------\n");
            System.out.println("Escolha a opção desejada:");
            System.out.println("1- Abastecer");
            System.out.println("2- Dirigir");
            System.out.println("3- Fim");

            opcao = in.nextInt();
            in.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Insira a placa do veículo desejado:");
                    cod = in.nextLine();
                    for (int i = 0; i < placas.length; i++) {
                        if(placas[i].getCodigo().equals(cod)){
                            System.out.println("Insira a quantidade de litros desejada:");
                            litros = in.nextInt();
                            carros[i].abastece(litros);
                        } else if(i == placas.length - 1)
                        System.out.println("Insira uma placa válida.");
                    } break;

                case 2:
                    System.out.println("Insira a placa do veículo desejado:");
                    cod = in.nextLine();
                    for (int i = 0; i < placas.length; i++) {
                        if(placas[i].getCodigo().equals(cod)){
                            System.out.println("Insira a distância desejada:");
                            litros = in.nextInt();
                            carros[i].dirige(litros);
                        } else if(i == placas.length - 1)
                         System.out.println("Insira uma placa válida.");
                    } 
                    
                    break;
            }
        }while(opcao != 3);
    }
}
