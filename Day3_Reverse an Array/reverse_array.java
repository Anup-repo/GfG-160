import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverse_array {
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> arr) {
        int i = 0;
        int j = arr.size()-1;
        while(i<=j) {
            Collections.swap(arr, i, j);
            i++; j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size and element for array:");
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> result = reverseArray(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
