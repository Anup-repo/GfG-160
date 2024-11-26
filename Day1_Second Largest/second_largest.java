import java.util.*;

public class second_largest {

    static int getSecondLargest(ArrayList<Integer>arr) {
        int second_large = -1;
        int large = arr.get(0);
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i) > large){
                second_large = large;
                large = arr.get(i);
            } 
            else if(arr.get(i) < large && arr.get(i) > second_large)
                second_large = arr.get(i);
        }
        return second_large;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size and space-separated integers: ");
        ArrayList<Integer> arr = new ArrayList<>();

        int n = scanner.nextInt();
        for(int i=0;i<n;i++)
            arr.add(scanner.nextInt());
        System.out.println(getSecondLargest(arr));
        scanner.close();
    }
}
