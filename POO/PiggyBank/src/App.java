import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int option,opt2 = 7;
        PiggyBank bank = new PiggyBank();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            bank.insert(NomeMoeda.UmReal);
        }
        
        System.out.println("Number of coins inside the PiggyBank: " + bank.getQuantCoins());
        System.out.println("Number of 'Um Real' coins inside the PiggyBank: " + bank.getQuantCoinsType(NomeMoeda.UmReal));
        System.out.println("Number of fifty 'centavos' coins are inside the PiggyBank: " + bank.getQuantCoinsType(NomeMoeda.Cinquenta));
        System.out.println("Total value of 'centavos' inside the PiggyBank: " + bank.getValueCents()+"R$");
        System.out.printf("Total value of 'reais' inside the PiggyBank: %.2fR$", bank.getValueReais());
        bank.retreatCoin();
        bank.retreatCoin();
        System.out.println("\nTotal value of 'centavos' inside the PiggyBank after retreating 2 coins: " + bank.getValueCents() + "R$");

        do {
            System.out.printf("Real Time Value inside PiggyBank: %.2f", bank.getValueReais());
            System.out.println("\n-------------------------------");
            System.out.println("What would you like to do next?");
            System.out.println("---------------------------------");
            System.out.println("1- Insert money");
            System.out.println("2- Retreat coins");
            System.out.println("3- End the program");
            option = in.nextInt();

                switch(option){
                        case 1:
                        do {
                            System.out.printf("Real Time Value inside PiggyBank: %.2f", bank.getValueReais());
                            System.out.println("\n-------------------------------");
                            System.out.println("How much would you like to Insert?");
                            System.out.println("1- One 'Real' ");
                            System.out.println("2- Fifty 'centavos' ");
                            System.out.println("3- Twenty five 'centavos'");
                            System.out.println("4- Ten 'centavos' ");
                            System.out.println("5- Five 'centavos'");
                            System.out.println("6- One 'centavo' ");
                            System.out.println("7- Back to menu");
        
                            opt2 = in.nextInt();
                            switch(opt2){
                                case 1:
                                if(bank.insert(NomeMoeda.UmReal) == false) 
                                    System.out.println("PiggyBank full.");
                                    break;
                                
                                case 2:
                                    if(bank.insert(NomeMoeda.Cinquenta) == false) 
                                    System.out.println("PiggyBank full.");
                                    break;
                                
                                case 3:
                                    if(bank.insert(NomeMoeda.VinteCinco) == false) 
                                    System.out.println("PiggyBank full.");
                                    break;
        
                                case 4:
                                    if(bank.insert(NomeMoeda.Dez) == false) 
                                    System.out.println("PiggyBank full.");
                                    break;
        
                                case 5:
                                    if(bank.insert(NomeMoeda.Cinco) == false) 
                                    System.out.println("PiggyBank full.");
                                    break;
        
                                case 6:
                                    if(bank.insert(NomeMoeda.Um) == false) 
                                    System.out.println("PiggyBank full.");
        
                            }
                        } while (opt2 != 7);
                        break;

                    case 2:
                    do {
                        System.out.printf("Real Time Value inside PiggyBank: %.2f", bank.getValueReais());
                        System.out.println("\n-------------------------------");
                        System.out.println("What would you like to do?");
                        System.out.println("1- Retreat the last coin ");
                        System.out.println("2- Back to menu");
                        opt2 = in.nextInt();
                        switch(opt2){
                            case 1:
                                if(bank.retreatCoin()==null)
                                System.out.println("PiggyBank empty.");
                                break;
                        }
                    } while (opt2 != 2);
                    break;
                        
                } 
        }while (option != 3);
    }   
}
