package Methods.insertionsort;

public class InsertionSort { 

    private int itera;
    private int instr;

    public int getInstr() {
        return instr;
    }

    public int getItera() {
        return itera;
    }
    public int[] insertionSort(int array[]) {  
        int n = array.length;  
        instr+=2;
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1; 
            instr+=6; 
            itera++;
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--; 
                instr+=8; 
                itera++;
            }  
            array[i+1] = key; 
            instr+=2; 
        }  
        instr++;
        return array;
    }
}
