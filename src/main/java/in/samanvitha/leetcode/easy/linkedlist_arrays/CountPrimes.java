package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class CountPrimes {
    public static void main( String[] args ) {
        CountPrimes obj = new CountPrimes();
        System.out.println(obj.countPrimes(20));
    }
    public int countPrimes(int n) {
        if(n==1 || n==0 || n==2)
            return 0;

        int[] arr= new int[n];
        arr[0]=-1;
        arr[1]=-1;
        int s=0;
        for(int i=2;i<Math.sqrt(n);i++){
            if(arr[i]!=-1){
                for(int j=i*i;j<n;j+=i){
                    arr[j]=-1;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
            if(arr[i]==0)
                s++;
        return s;
    }
}
