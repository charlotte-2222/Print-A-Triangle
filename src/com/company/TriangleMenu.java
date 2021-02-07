package com.company;
import java.util.Scanner;
import static java.lang.System.out;

public class TriangleMenu {
    private static Object shapeChoice;

    public static String Menu() {
        String select = null;
        try {
            Scanner in = new Scanner(System.in);
            out.println("-------------------------");
            out.println("Select Triangle to print: ");
            out.println("R - Right Triangle");
            out.println("I - Isosceles Triangle");
            out.println("D - Diamond");
            out.print("Enter your choice: ");
            select = in.nextLine();
            return select;
        } catch (Exception e) {
            Main.infoBox("Invalid input", "Error!");
        }
        return select;
    }
}
