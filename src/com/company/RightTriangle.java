package com.company;
import java.util.Scanner;

import static java.lang.System.out;
public class RightTriangle {

    public static void rTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines to be printed: ");
        int rows = sc.nextInt();
        for (int r = 1; r <= rows; r++) {
            for (int j = 1; j <= r; j++) {
                out.print("* ");
            }
            out.println(" ");
        }
        out.println();
    }

}
