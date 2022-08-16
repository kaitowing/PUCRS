public class App {
    public static void main(String[] args) {
        int option;
        PiggyBank bank = new PiggyBank();

        for (int i = 0; i < 11; i++) {
            bank.insert(NomeMoeda.UmReal);
        }
        
        System.out.println("Number of coins inside the PiggyBank: " + bank.getQuantCoins());
        System.out.println("Number of 'Um Real' coins inside the PiggyBank: " + bank.getQuantCoinsType(NomeMoeda.UmReal));
        System.out.println("Number of fifty 'centavos' coins are inside the PiggyBank: " + bank.getQuantCoinsType(NomeMoeda.Cinquenta));
        System.out.println("Total value of 'centavos' inside the PiggyBank: " + bank.getValueCents());
        System.out.printf("Total value of 'reais' inside the PiggyBank: ",bank.getValueReais(),"%.2f");
        bank.retreatCoin();
        bank.retreatCoin();
        System.out.println("Total value of 'centavos' inside the PiggyBank after retreating 2 coins: " + bank.getValueCents());
    }   
}
