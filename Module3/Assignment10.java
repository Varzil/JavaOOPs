package Module3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int idx = Arrays.binarySearch(arr, key);
        System.out.println(idx);
    }
}
