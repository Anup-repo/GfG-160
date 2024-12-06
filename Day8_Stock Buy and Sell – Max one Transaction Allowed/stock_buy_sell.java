import java.util.ArrayList;
import java.util.Scanner;

public class stock_buy_sell {
    public static int maximumProfit(ArrayList<Integer> arr) {
        int buy = arr.get(0);
        int profit = 0;
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i)<buy)
                buy = arr.get(i);
            else if(arr.get(i)-buy > profit)
                profit = arr.get(i)-buy;
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
        System.out.print("Maximum profit: "+ result);
        System.out.println();
        sc.close();
    }
}
