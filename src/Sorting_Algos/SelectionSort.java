package Sorting_Algos;

public class SelectionSort {
  public static int[] selectionSort(int[] arr){
    int len=arr.length;
    for(int i=0; i<len-1; i++){
      int minInd = i;
      for(int j=i; j<len; j++){
        minInd = (arr[j]>arr[minInd]) ? minInd : j;
      }
      if(minInd==i) continue;;
      int temp=arr[minInd];
      arr[minInd]=arr[i];
      arr[i]=temp;
    }
    return arr;
  }
}
