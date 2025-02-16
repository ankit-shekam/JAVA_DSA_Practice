package Sorting_Algos;

public class BubbleSort {
  public static int[] bubbleSort(int[] arr){
    int len = arr.length;
    boolean swapped;
    for(int i=0; i<len-1; i++){
      swapped=false;
      for(int j=0; j<len-1-i; j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          swapped=true;
        }
      }
      if(!swapped) break;
    }
    return arr;
  }
}
