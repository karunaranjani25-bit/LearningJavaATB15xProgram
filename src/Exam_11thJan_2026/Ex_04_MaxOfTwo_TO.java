package Exam_11thJan_2026;

import java.util.Scanner;

public class Ex_04_MaxOfTwo_TO {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values of a and b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Values of a and b are: "+a+"," +b);

        System.out.println("Max of a and b is : "+((a>b)?a:b));
    }
}
