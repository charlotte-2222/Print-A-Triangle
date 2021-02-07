package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class IsoscelesTriangleClass {
    public static void iTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines to be printed");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                out.print("* ");
            }
            out.println();
        }
    }
}
