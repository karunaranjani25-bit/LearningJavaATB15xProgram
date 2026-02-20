package Exam_11thJan_2026;

import java.util.Scanner;

public class Ex_07_SimpleCalcualtor_Switch {

    public static void main(String[] args) {

       int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a = scanner.nextInt();
        System.out.println("Enter value of b: ");
        b = scanner.nextInt();

        System.out.println("select the operation (+,-,*,/,%): ");
        char operator = scanner.next().charAt(0);

        switch(operator){

            case '+' :
                System.out.println("Sum = "+(a+b));
                break;

            case '-' :
                System.out.println("Difference = "+(a-b));
                break;

            case '*' :
                System.out.println("multiplication = "+(a*b));
                break;

            case '/' :
                System.out.println("Division = " +(a/b));
                break;

            case '%' :
                System.out.println("Remainder = "+(a%b));
                break;

            default :
                System.out.println("Invalid entry pls rerun the program and select appropriate operator");
        }
    }
}
