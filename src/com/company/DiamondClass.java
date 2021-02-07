package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class DiamondClass {

    public static void Diamond(){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of lines to be printed: ");
            int rows = sc.nextInt();
            for (int i = 1; i < rows; i += 2) {
                for (int j = 0; j < rows - 1 - i / 2; j++) {
                    out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    out.print("*");
                }
                out.print("\n");
            }
            for (int i = rows; i > 0; i -= 2) {
                for (int j = 0; j < rows - 1 - i / 2; j++) {
                    out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    out.print("*");
                }
                out.print("\n");
            }
        }
}
