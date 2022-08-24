public class App {
    public static void main(String[] args) throws Exception {
        int[] v = new int[25];
        for (int i = 0; i < v.length; i++) {
            v[i] = i;
        }
        bubbleSort(v);
    }

    public static int[] bubbleSort(int v[]){
        int aux = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if(v[j] > v[j+1])
                    v[j] = aux;
                    v[j] = v[j+1];
                    v[j+1] = aux;
            }
        }

        return v;
    }
}
