package Module3;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int idx = binarySearch(arr, key);
        System.out.println(idx);
    }

    static int binarySearch(int[] arr, int key) {
        int lb = 0, ub = arr.length-1, mid;

        while(lb <= ub) {
            try {
                mid = (lb + ub) / 2;
                if(arr[mid] == key)
                    return mid;
                else if(arr[mid] > key)
                    ub = mid-1;
                else lb = mid+1;
                if(lb > ub) throw new ArrayIndexOutOfBoundsException();
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Element not found");
                System.exit(0);
            }
        }
        return -1;
    }
}
