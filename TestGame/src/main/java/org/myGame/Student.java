package org.myGame;
import java.util.Scanner;
import org.myGame.Grade;
public class Student
{
    public String Student()
    {
        Scanner scanner = new Scanner(System.in);

        int StudentID;
        float StudentGrade;
        char StudentSection;

        System.out.println("Enter Student ID: ");
        StudentID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Student Grade: ");
        StudentGrade = scanner.nextFloat();
        scanner.nextLine();

        if (getUniGrade())
        {

        }



        return null;
    }

}
