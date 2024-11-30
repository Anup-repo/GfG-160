import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class next_permutation {
    public static ArrayList<Integer> get_permutation(ArrayList<Integer> arr) {
        int break_point = -1;
        for (int i = arr.size()-2; i >= 0 ; i--) { // step 1
            if (arr.get(i) < arr.get(i+1)) {
                break_point = i;
                break;
            }
        }
        if(break_point==-1) {
            Collections.reverse(arr);
            return arr;
        }

        for (int i = arr.size()-1; i > break_point ; i--) { // step 2
            if (arr.get(i) > arr.get(break_point)) {
                Collections.swap(arr, break_point, i);
                break;
            }
        }
        List<Integer> sublist = arr.subList(break_point + 1, arr.size()); // Step 3
        Collections.reverse(sublist);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size and space separated array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> result = get_permutation(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
