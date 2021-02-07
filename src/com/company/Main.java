package com.company;
import javax.swing.*;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        try {
            while (true) {
                Scanner input = new Scanner(in);
                out.println("------------------");
                out.print("Enter your full name: ");
                String fullName = input.nextLine();
                String shapeChoice = TriangleMenu.Menu();
                switch (shapeChoice.toUpperCase()) {
                    case "R" -> RightTriangle.rTriangle();
                    case "I" -> IsoscelesTriangleClass.iTriangle();
                    case "D" -> DiamondClass.Diamond();
                    default -> infoBox("Invalid input", "Error!");
                }
                out.print("Try the program again?: ");
                String loop = input.nextLine();
                switch (loop.toUpperCase()) {
                    case "Y" -> out.println("Continuing...");
                    case "N" -> infoBox("Thank you for using this program","Bye!");
                    default -> {
                        infoBox("Invalid input\nPlease only use 'Y' or 'N'",
                                "");
                        if(loop.toUpperCase()=="n"){
                            System.exit(1);
                        }
                    }

                }

            }
        }catch(Exception e){infoBox("Be sure to use numerical values","Error!");}
    }

    public static void infoBox(String s, String sq) {
        JOptionPane.showMessageDialog(null, s, "" +
                sq, JOptionPane.INFORMATION_MESSAGE);
    }
}