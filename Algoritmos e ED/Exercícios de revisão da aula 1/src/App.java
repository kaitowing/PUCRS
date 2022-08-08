public class App {
    public static void main(String[] args) {
        int[] l = new int[2];
        l[1] = 2;
        l[2] = 2;
        System.out.println(hasRepeat(l));
    }

    public static String recebe(int n){
        String numeros="";
        for (int i = 0; i <= n; i++){
            numeros = numeros + i;
        }

        return numeros;
    }

    public static int[] recebeArray(int n){
        int[] numeros= new int[n];
        for (int i = 0; i < n; i++){
            numeros[i] = i;
        }

        return numeros;
    }

    private static boolean ePrimo(int n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0)
                return false;   
        }
        return true;
    }
    private static int[] entrePrimos(int n, int m){
        int[] numeros = new int[m];
        for (int i = n; i < m; i++){

            if(ePrimo(i)){
                numeros[i] = i;
            }
        }
        return numeros;

    }
    private static int nOcorrencias(int[] l, Integer el){
        int n = 0;
        for (int i = 0; i < l.length; i++) {
            if(l[i] == el) n++;
            
        }
        return n;
    }
    private static boolean hasRepeat(int[] l){
        for(int i = 0; i < l.length; i++) {
            for(int j = i; j < l.length - 1; j++) {
                if(l[i] == l[j]) return true;
            }
        }
        return false;
    }
    private static int nroRepeat(int[] l){
        int num = 0;
        for(int i = 0; i < l.length ; i++) {
            for(int j = i; j < l.length - 1; j++) {
                if(l[i] == l[j]) num++;
            }
        }
        return num;
    }
    private static int[] listRepeat(int[] l){
        int[] elementos = new int[l.length];
        for (int i = 0; i < l.length - 1; i++){
            if(hasRepeat(l)){
                elementos[i] = i;
            }
        }
        return elementos;
    }
    private static int[] union(int[] l1, int[] l2){
        int a = l1.length + l2.length - 2;
        int[] novaLista = new int[a];

        for (int i = 0; i < l1.length; i++) {
            novaLista[i] = l1[i];
        }

        for (int i = l1.length -1; i < novaLista.length; i++) {
            novaLista[i] = l2[i];
        }
        return novaLista;
    }
    private static int[] intersect(int[] l1, int[] l2){
        int a = l1.length + l2.length - 2;
        int[] novaLista = new int[a];
        for(int i = 0; i < novaLista.length ; i++) {
            for(int j = i; j < novaLista.length - 1; j++) {
                if(l1[i] == l2[j]) novaLista[i] = l1[i];
            }
        }
        return novaLista;
    }
}
