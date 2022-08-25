// Write a program in Java to multiply two matrixes.
import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] args) {
        int r1 = 2, c1 = 3, r2 = 3, c2 = 1;
        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        int[][] m3 = new int[r1][c2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input for first matrix : ");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("First matrix is : ");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter input for first matrix : ");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Second matrix is : ");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                m3[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    m3[i][j] = m3[i][j] + m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("Multiplication of m1 and m2 is : ");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(m3[i][j] + "\t");
                System.out.println();
            }
        }
    }
}
