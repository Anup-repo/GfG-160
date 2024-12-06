import java.util.ArrayList;
import java.util.Scanner;

public class maximum_prod_subarray {
    public static int maxProduct(ArrayList<Integer> arr) { 
        int prefix = 1;
        int suffix = 1;
        int result = Integer.MIN_VALUE;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if(prefix==0)
                prefix = 1;
            if(suffix==0)
                suffix = 1;
            prefix *=  arr.get(i);
            suffix *= arr.get(n-i-1);
            result = Math.max(result,Math.max(prefix,suffix));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size and element in array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int result = maxProduct(arr);
        System.out.println("Maximum product: "+result);
        sc.close();
    }
}
