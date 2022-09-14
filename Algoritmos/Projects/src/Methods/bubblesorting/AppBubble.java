package Methods.bubblesorting;
public class AppBubble {
    private int itera;
    private int instr;
    private int itera2;
    private int instr2;

    public int[] bubbleSort(int v[]){
        int aux = 0;
        instr++;
        for (int i = 0; i < v.length; i++) {
            instr+=4;
            for (int j = 0; j < v.length - 1 - i; j++) {
                instr+=6;
                if(v[j] > v[j+1])
                    v[j] = aux;
                    v[j] = v[j+1];
                    v[j+1] = aux;
                    itera++;
                    instr+=7;
            }
            instr++;
        }
        instr+=2;

        return v;
    }
    
    public int getInstr() {
        return instr;
    }

    public int getItera() {
        return itera;
    }

    public int getInstr2() {
        return instr2;
    }

    public int getItera2() {
        return itera2;
    }

    public int[] bubbleSortV2(int v[]){
        int aux = 0;
        boolean trocou = true;
        instr2+=2;
        while (trocou){
            trocou = false;
            instr2++;
            for (int i=0; i<v.length-1; i++){
                itera2++;
                instr2+=5;
                if (v[i] > v[i+1]) {
                    v[i] = aux;
                    v[i] = v[i+1];
                    v[i+1] = aux;
                    trocou = true;
                    instr2+=8;
                }
            }
            instr2++;
        }
        instr++;
        return v;
    }
}
