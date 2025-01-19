package Sorting_Algos;

public class InsertionSort {
  public static int[] insertionSort(int[] arr){
    int len=arr.length;
    for(int i=1; i<len; i++){
      int key=arr[i];
      int j=i-1;
      while(j>=0 && arr[j]>key){
        arr[j+1] = arr[j--];
      }
      arr[j+1]=key;
    }
    return arr;
  }
}
