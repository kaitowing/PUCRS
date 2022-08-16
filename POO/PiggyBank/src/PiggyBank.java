public class PiggyBank {
    private Moeda[] coins;
    private int cont;

    public PiggyBank(int n){
        coins = new Moeda[n];
        cont = 0;
    }

    public PiggyBank(){
        coins = new Moeda[100];
        cont = 0;
    }

    public boolean insert(NomeMoeda nome){
        if(cont<coins.length){
            coins[cont] = new Moeda(nome);
            cont++;
            return true;
        }
        else return false;
    }

    public Moeda retreatCoin(){
        Moeda coin = coins[cont-1];
        coins[cont-1] = null;
        cont--;
        return coin;
    }

    public int getQuantCoins(){
        return cont;
    }

    public int getQuantCoinsType(NomeMoeda nomeMoeda){
        int num = 0;
        for (int i = 0; i < coins.length; i++) {
            if(coins[i] != null){
                if(coins[i].getNomeMoeda() == nomeMoeda)
                num++;
            } else return num;
        }
        return num;
    }

    public int getValueCents(){
        int num = 0;
        for (int i = 0; i < coins.length; i++) {
            if(coins[i] != null){
                num = num + coins[i].getValorCentavos();
            } else return num;
        }
        return num;
    }

    public double getValueReais(){
        double num = 0;
        for (int i = 0; i < coins.length; i++) {
            if(coins[i] != null){
                num = num + coins[i].getValorReais();
            } else return num;
        }
        return num;
    }
}
