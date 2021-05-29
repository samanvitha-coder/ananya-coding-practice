package in.samanvitha.leetcode.easy.linkedlist_arrays;
import java.util.*;

public class DestinationCity {
    public static void main( String[] args ) {
        DestinationCity obj = new DestinationCity();
        Scanner scanner = new Scanner(System.in);
        List<List<String>> listoflists = new ArrayList<List<String>>();
        System.out.println("Enter no.of sublists");
        int n= scanner.nextInt();
        System.out.println("Enter length of sublist");;
        int size = scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+"th sublist elements");
            List<String> list1 = new ArrayList<String>();
            for(int j=0;j<size;j++){
                list1.add(scanner.next());
            }
            listoflists.add(list1);
        }
        System.out.println(obj.destCity(listoflists));
    }


    public String destCity(List<List<String>> paths) {
        String start = paths.get(0).get(0);
        String dest =  paths.get(0).get(1);
        HashMap<String, String> hm = new HashMap<>();
        for (List<String> list:paths) {

            hm.put(list.get(0), list.get(1));
        }
        while(true){
            if(hm.containsKey(dest)){
                dest = hm.get(dest);
            }
            else {
                return dest;
            }
        }
    }
}
