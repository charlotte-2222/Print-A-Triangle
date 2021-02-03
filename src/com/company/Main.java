package com.company;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        do {
            try {
                Scanner input = new Scanner(in);
                out.println("------------------");
                out.print("Enter your full name: ");
                String fullName = input.nextLine();
                String shapeChoice = TriangleMenu.Menu();
                switch (shapeChoice) {
                    case "R" -> RightTriangle.rTriangle();
                    case "r" -> RightTriangle.rTriangle();
                    case "I" -> IsoscelesTriangleClass.iTriangle();
                    case "i" -> IsoscelesTriangleClass.iTriangle();
                    case "D" -> DiamondClass.Diamond();
                    case "d" -> DiamondClass.Diamond();
                }

                out.println("Hope you enjoyed the program, "+fullName);
                out.print("Loop: ");
                String loop = input.nextLine();
                switch(loop){
                    case "Y" -> out.println("Continuing...");
                    case "y" -> out.println("Continuing...");
                    case "N" -> System.exit(0);
                    case "n" -> System.exit(0);
                }

            }catch (Exception e) {out.print("Someone has a small pee pee");}

        }while (true);
    }
}