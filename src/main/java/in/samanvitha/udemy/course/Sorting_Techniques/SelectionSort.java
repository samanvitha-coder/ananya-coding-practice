package in.samanvitha.udemy.course.Sorting_Techniques;

public class SelectionSort {
    public static void main( String[] args ) {
        SelectionSort selection = new SelectionSort();
        int[] arr = {10,35,29,42,12,89,45};
        selection.selectionSort(arr);
    }
    public void selectionSort(int[] arr){

        for(int i= arr.length-1;i>0;i--) {
            int large = 0;
            for(int j=0;j<=i;j++) {
                if(arr[j]>arr[large]){
                    large = j;
                }
            }
            int temp = arr[large];
            arr[large] = arr[i];
            arr[i] = temp;
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
