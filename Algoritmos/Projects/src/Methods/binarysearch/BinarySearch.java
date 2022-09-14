package Methods.binarysearch;
import java.util.*;
public class BinarySearch {
    private int itera;
    private int instr;
	public int binarySearch(int v[] , int value){
        int low = 0;
        int high = v.length - 1;
        int index = high/2;
        instr+=6;
        while(low<=high){
            instr++;
            if(v[index] > value){
                high = index - 1;
                instr+=3;
            }
            else if(v[index] < value){
                low = index + 1;
                instr+=3;
            }
            else{
                instr++;
                return index;
            } 

            index = low + ((high - low)/2);
            instr+=4;
            itera++;
        }
        instr++;
        return -1;
    }

    public int getInstr() {
        return instr;
    }

    public int getItera() {
        return itera;
    }

    public int directSerch(int v[], int valor){
        for (int i = 0; i < v.length; i++) {
            if(v[i]==valor)
            return i;
            itera++;
        }
        instr++;
        return -1;
    }

	public int[] geraVetor(int nroElem, int lim){
        int dummy;
        int [] res = null;
        int cont = 0;
        Random rnd = new Random(System.nanoTime() * System.currentTimeMillis());
     
        if (nroElem >= 0) {
     
                    res = new int[nroElem];
     
                    while (cont < nroElem) {
                                  dummy = rnd.nextInt(lim)+1;
                                  dummy = rnd.nextInt(lim)+1;
                                  res[cont++] = rnd.nextInt(lim)+1;
                   }
        }
        return res;
    }
}
