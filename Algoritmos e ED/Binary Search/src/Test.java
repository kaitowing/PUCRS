import java.util.*;
public class Test {
    private long tempoIni;
    private long tempoFim;

    public Test(){
        tempoIni = 0;
        tempoFim = 0;
    }

    public void initClock() {
		tempoIni = tempoFim = System.nanoTime();
	}

	public double getClockSec() {
		double res;

		tempoFim = System.nanoTime();

		res =  ((double)tempoFim - (double)tempoIni) / (double)1_000_000_000.0;

		return res;
	}

	public int binarySearch(int v[] , int value){
        int low = 0;
        int high = v.length - 1;
        int index = high/2;
        int contador = 0;
        while(low<=high){
            if(v[index] > value)
                high = index - 1;
            else if(v[index] < value)
                low = index + 1;
            else return index;

            index = low + ((high - low)/2);
            contador++;
        }
        System.out.println(contador);
        return -1;
    }

    public int directSerch(int v[], int valor){
        int contador = 0;
        for (int i = 0; i < v.length; i++) {
            if(v[i]==valor)
            return i;
            contador++;
        } 
        System.out.println(contador);
        return -1;
    }

	public int[] geraVetor(int nroElem, int lim){
        int dummy;
        int [] res = null;
        int cont = 0;
        int contador = 0;
        Random rnd = new Random(System.nanoTime() * System.currentTimeMillis());
     
        if (nroElem >= 0) {
     
                    res = new int[nroElem];
     
                    while (cont < nroElem) {
                                  dummy = rnd.nextInt(lim)+1;
                                  dummy = rnd.nextInt(lim)+1;
                                  res[cont++] = rnd.nextInt(lim)+1;
                                  contador++;
                   }
        }
        System.out.println(contador);
        return res;
    }
}
