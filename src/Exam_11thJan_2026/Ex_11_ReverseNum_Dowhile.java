package Exam_11thJan_2026;

import java.util.Scanner;

public class Ex_11_ReverseNum_Dowhile {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = scanner.nextInt();
        int rev = 0;

        do{
            int i = n%10;
            rev = rev*10+i;
            n=n/10;
        }while(n>0);
        System.out.println("Reverse of n is: "+rev);
    }
}
