package ex_14_strings;

import java.util.Scanner;

public class Lab_StringReverse {

    public static void main(String[] args) {

        //String s1 = "abcdef";
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = "";

        for(int i=s1.length()-1;i>=0;i--){

            s2 = s2 + s1.charAt(i);
        }
        System.out.println("Reversed string = "+s2);
    }
}
