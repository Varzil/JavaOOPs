package Module1;//Write a Java Program to find area of Geometric figures using method Overloading.

import java.util.Scanner;
public class Assignment_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area;
        System.out.println("Triangle: ");
        System.out.println("Enter length of three sides of the triangle");
        area = area(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Area of triangle: " + area);

        System.out.println("Circle:");
        System.out.print("Enter radius of circle: ");
        area = area(sc.nextDouble());
        System.out.println("Area of circle: " + area);

        System.out.println("Parallelogram: ");
        System.out.print("Enter base and height of parallelogram: ");
        area = area(sc.nextDouble(), sc.nextDouble());
        System.out.println("Area of parallelogram: " + area);
    }
    static double area(double a, double b, double c) {
        double s = (a+b+c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    static double area(double radius) {
        return Math.PI * radius * radius;
    }
    static double area(double base, double height) {
        return base * height;
    }

}
