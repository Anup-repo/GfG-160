import java.util.ArrayList;
import java.util.Scanner;

public class kadanes_algo {
    public static int maxSubArraySum(ArrayList<Integer> arr) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if(sum > maxi)
                maxi = sum;
            if(sum<0)
                sum = 0;
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the soze and element of array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int result = maxSubArraySum(arr);
        System.out.println("Maximum subarray sum: "+result);
        sc.close();
    }
}
