package Exam_18thJan_2026;

import java.util.Scanner;

public class Ex02_strLength {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = scanner.nextLine();
        int len = s.length();
        if(len > 10){
            System.out.println("Length is >10");
        }
        else{
            System.out.println("Length is <10");
        }
    }
}
