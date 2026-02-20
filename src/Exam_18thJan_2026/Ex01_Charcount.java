package Exam_18thJan_2026;

import java.util.Scanner;

public class Ex01_Charcount {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scanner.nextLine();

        String newstring = s.replace(" ","");
        System.out.println("total no.of characters in given string = "+newstring.length());
        System.out.println("total no.of characters in original string = "+s.length());

    }
}
