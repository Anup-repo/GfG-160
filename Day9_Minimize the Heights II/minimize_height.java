import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class minimize_height {
    public static int getMinDiff(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        int small = arr.getFirst()+k;
        int large = arr.getLast()-k;
        int result = arr.getLast() - arr.getFirst();
        for (int i = 0; i < arr.size()-1; i++) {
            int mini = Math.min(small, arr.get(i+1)-k);
            int maxi = Math.max(large, arr.get(i)+k);
            if(mini < 0)
                continue;
            result = Math.min(result,maxi-mini);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of k: ");
        int k = sc.nextInt();
        System.out.println("Enter the size and element of array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int result = getMinDiff(arr, k);
        System.out.println("Minimum Height: "+ result);
        sc.close();
    }
}
