package in.samanvitha.udemy.course.sorting_algorithms;

public class InsertionSort {
    public static void main( String[] args ) {
        InsertionSort insert = new InsertionSort();
        int[] arr = {10,35,29,42,12,89,45};
        int[] arr1 = insert.insertionSort(arr);
    }
    public int[] insertionSort(int[] arr){

        for(int i=1;i< arr.length;i++){
            int n = arr[i];
            int j=i;
            while(j>0 && arr[j-1]>n){
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j] = n;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return arr;
    }

}
