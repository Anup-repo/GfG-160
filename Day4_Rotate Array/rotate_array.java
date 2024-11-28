import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class rotate_array {

    public static void reverse_array(ArrayList<Integer> arr, int i, int j) {
        while(i<=j) {
            Collections.swap(arr, i, j);
            i++; j--;
        }
    }
    public static ArrayList<Integer> rotateArr(ArrayList<Integer> arr, int d) {
        int n = arr.size();
        d = n%d;
        reverse_array(arr, 0, d-1);
        reverse_array(arr, d+1, n-1);
        reverse_array(arr, 0, n-1);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of d: ");
        int d = sc.nextInt();
        System.out.println("Enter the size and element of array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> result = rotateArr(arr, d);
        for(int num: result) {
            System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }
}
