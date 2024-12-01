import java.util.ArrayList;
import java.util.Scanner;

public class majority_element {
public static ArrayList<Integer> findMajority(ArrayList<Integer> arr) {
    int candidate_1 = 0, candidate_2 = 0, count_1 = 0, count_2 = 0;
    for (int num : arr) {
        if(count_1 == 0 && num != candidate_2) {
            count_1 = 1;
            candidate_1 = num;
        } 
        else if(count_2 == 0 && num != candidate_1) {
            count_2 = 1;
            candidate_2 = num;
        }
        else if(num == candidate_1) 
            count_1++;
        else if(num == candidate_2)
            count_2++;
        else
            count_1--; count_2--;
    }

    count_1 = 0; count_2 = 0;
    int threshold = arr.size()/3;
    for (int num : arr) {
        if(num == candidate_1) 
            count_1++;
        else if(num == candidate_2)
            count_2++;
    }
    ArrayList<Integer> result = new ArrayList<>();
    if(count_1 > threshold && count_2 > threshold) {
        result.add(Math.min(candidate_1, candidate_2));
        result.add(Math.max(candidate_1,candidate_2));
        return result;
    }
    if(count_1 > threshold)
        result.add(candidate_1);
    else if(count_2 > threshold)
        result.add(candidate_2);
    return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size and element of array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> result = findMajority(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }
}
