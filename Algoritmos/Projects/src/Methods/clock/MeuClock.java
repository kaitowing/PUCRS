package Methods.clock;

public class MeuClock {
    private long tempoIni, tempoFim;

    public MeuClock(){
        this.tempoFim = 0;
        this.tempoIni = 0; 
    }

        public void initClock() {
        tempoIni = tempoFim = System.nanoTime();
    }

        public double getClockSec() {
        double res;
        tempoFim = System.nanoTime();
        res = ((double)tempoFim - (double)tempoIni) / (double)1000000000.0;
        return res;
    }

    //Antes de chamar o método cujo tempo quer medir, chame

    //        initClock();

    //Após a execução do método a ser medido, chame

    //        double res = getClockSec();
}
