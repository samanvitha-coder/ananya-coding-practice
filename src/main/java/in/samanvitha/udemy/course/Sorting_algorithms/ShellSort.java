package in.samanvitha.udemy.course.sorting_algorithms;

public class ShellSort {
    public static void main( String[] args ) {
        ShellSort shell = new ShellSort();
        int[] arr = {10,35,29,42,12,89,45};
        int[] arr1 = shell.shellSort(arr);
    }

    public int[] shellSort(int[] arr){

        for(int gap=arr.length/2;gap>0;gap/=2) {
            for(int i=gap;i<arr.length;i++) {
                int n = arr[i];
                int j=i;
                while(j>=gap && arr[j-gap]>n) {
                    arr[j] = arr[j-gap];
                    j = j - gap;
                }
                arr[j] = n;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return arr;
    }
}
