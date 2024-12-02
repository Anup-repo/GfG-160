import java.util.ArrayList;
import java.util.Scanner;

public class stock_buy_sell {
    public static int maximumProfit(ArrayList<Integer> arr) {
        int profit = 0;
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > arr.get(i-1))
                profit += (arr.get(i) - arr.get(i-1));
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size and element of array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int result = maximumProfit(arr);
        System.out.println("Maximum Profit: "+result);
        sc.close();
    }
}
