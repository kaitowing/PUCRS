package binarysearch;
import java.util.*;
public class AppSearch {
    public static void main(String[] args) {
        Test vetores = new Test();

        int[] v = vetores.geraVetor(1000000, 100000);
        vetores.initClock();
        System.out.println(vetores.directSerch(v, -1));
        System.out.println(vetores.getClockSec());
    }
}
