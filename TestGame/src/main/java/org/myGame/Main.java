package org.myGame;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

        public static void main(String[] args)
        {

                    Grade grade = new Grade();
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Enter Module 1 Grade: ");
                    float mod1 = scanner.nextFloat();
                    scanner.nextLine();

                    System.out.print("Enter Module 2 Grade: ");
                    float mod2 = scanner.nextFloat();
                    scanner.nextLine();

                    System.out.print("Enter Module 3 Grade: ");
                    float mod3 = scanner.nextFloat();
                    scanner.nextLine();

                    grade.setGrade(mod1, mod2, mod3);
                    System.out.println("Numerical Grade: " + grade.Average());

                    String uniGrade = grade.getUniGrade();
                    System.out.print(uniGrade);
        }

}


