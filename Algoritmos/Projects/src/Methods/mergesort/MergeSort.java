package Methods.mergesort;
import java.util.Arrays;

// Merge sort in Java

public class MergeSort {
  private int itera;
  private int instr;

  // Merge two sub arrays L and M into array
  public void merge(int array[], int p, int q, int r) {

    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int[n1];
    int M[] = new int[n2];
    instr += 9;
    // fill the left and right array
    for (int i = 0; i < n1; i++){
      itera++;
      instr+=5;
      L[i] = array[p + i];
    }
    for (int j = 0; j < n2; j++){
      itera++;
      instr+=6;
      M[j] = array[q + 1 + j];
    }
    instr +=2;

    // Maintain current index of sub-arrays and main array
    int i, j, k;
    i = 0;
    j = 0;
    k = p;
    instr+=3;

    // Until we reach either end of either L or M, pick larger among
    // elements L and M and place them in the correct position at A[p..r]
    // for sorting in descending
    // use if(L[i] >= <[j])
    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        array[k] = L[i];
        i++;
        instr+=7;
      } else {
        array[k] = M[j];
        j++;
        instr+=3;
      }
      k++;
      instr+=2;
      itera++;
    }

    // When we run out of elements in either L or M,
    // pick up the remaining elements and put in A[p..r]
    while (i < n1) {
      array[k] = L[i];
      i++;
      k++;
      itera++;
      instr+=6;
    }

    while (j < n2) {
      array[k] = M[j];
      j++;
      k++;
      itera++;
      instr+=6;
    }
  }

  // Divide the array into two sub arrays, sort them and merge them
  public void mergeSort(int array[], int left, int right) {
    if (left < right) {

      // m is the point where the array is divided into two sub arrays
      int mid = (left + right) / 2;
      instr+=4;

      // recursive call to each sub arrays
      mergeSort(array, left, mid);
      instr++;
      mergeSort(array, mid + 1, right);
      instr++;

      // Merge the sorted sub arrays
      merge(array, left, mid, right);
      instr++;
    }
  }

  public int getInstr() {
      return instr;
  }

  public int getItera() {
      return itera;
  }
}