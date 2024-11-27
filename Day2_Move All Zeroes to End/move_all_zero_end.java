import java.util.ArrayList;
import java.util.Scanner;

public class move_all_zero_end {
    public static ArrayList<Integer> pushZerosToEnd(ArrayList<Integer> arr) {
        int first_zero = -1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==0)
                first_zero = i;
        }
        if(first_zero==-1)
            return arr;
            int i = first_zero;
        for(int j=i+1;j<arr.size();j++) {
            if(arr.get(j)!=0) {
                int temp = arr.get(j);
                arr.set(j, arr.get(i));
                arr.set(i, temp);
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size and element of array");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> result = pushZerosToEnd(arr);
        System.out.println("Array after moving all zeros to the end:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
