package Exam_11thJan_2026;

import java.util.Scanner;

public class Ex_05_PNOrzero_TO {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = scanner.nextInt();
        System.out.println("Given number is :" +((n==0)?"0":((n>0)?"Positive":"negative")));

    }
}
