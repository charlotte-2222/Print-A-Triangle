package com.company;
import java.util.Scanner;
import static java.lang.System.out;

public class TriangleMenu {
    public static String Menu() {
        Scanner in = new Scanner(System.in);
        out.println("-------------------------");
        out.println("Select Triangle to print: ");
        out.println("R - Right Triangle");
        out.println("I - Isosceles Triangle");
        out.println("D - Diamond");
        out.print("Enter your choice: ");
        String select = in.nextLine();
        return select;
    }
}
