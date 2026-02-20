package Exam_11thJan_2026;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ex_01_ArithmeticOperations {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = scanner.nextInt();
        System.out.println("Enter value of b: ");
        int b = scanner.nextInt();

        //Addition
        System.out.println("Sum of a and b = "+(a+b));

        //Subtraction
        System.out.println("Difference a-b = "+(a-b));

        //Multiplication
        System.out.println("Multiplication of a and b = "+(a*b));

        //Division
        System.out.println("Division a/b = "+(a/b));

        //Reminder
        System.out.println("Reminder of a/b = "+(a%b));

    }
}
