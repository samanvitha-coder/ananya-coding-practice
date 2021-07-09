package in.samanvitha.udemy.course.Sorting_algorithms;

public class InsertionSortUsingRecursion {
    public static void main(String[] args) {

        int[] arr =  {10,35,29,42,12,89,45};

        insertionSort(arr ,arr.length);

        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void insertionSort(int[] arr, int numItem){
        if(numItem < 2){
            return;
        }

        insertionSort(arr, numItem-1);

        int newElement = arr[numItem - 1];

        int i;

        for(i = numItem - 1; i > 0 && arr[i - 1] > newElement; i--){
            arr[i] = arr[i - 1];
        }

        arr[i] = newElement;

        System.out.println("Result of call when numItem = " + numItem);
        for (i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" , ");
        }
        System.out.println("");

    }
}
