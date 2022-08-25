//Write a program in Java to sort the elements of list so that they are in ascending order.

import java.util.Scanner;

public class Assignment_14 {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int[] arr){
        int temp;
        boolean swapped;
        for(int i=0; i<arr.length; i++) { swapped = false;
            for(int j=1; j<arr.length-i; j++) if(arr[j-1] > arr[j]) {
                swap(arr, j-1, j); swapped = true;
            }
            if(!swapped)
                break;
        }
        System.out.print("The sorted array is : ");
        for (int j : arr) {
            System.out.print(j +" ");
        }
    }
    static void input(){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the terms ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
    }
    public static void main(String[] args) {
        input();
    }
}
