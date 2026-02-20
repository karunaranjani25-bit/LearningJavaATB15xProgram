package ex_Task_ConditionalStatements;

import java.util.Scanner;

public class Lab068_TriangleClassifier {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Side1 of triangle: ");
        int s1 = s.nextInt();

        System.out.println("Enter Side2 of triangle: ");
        int s2 = s.nextInt();

        System.out.println("Enter Side3 of triangle: ");
        int s3 = s.nextInt();

        if(s1==s2 && s2==s3){
            System.out.println("Equilateral triangle");
        }
        else if (s1==s2 || s2==s3 || s3==s1){
            System.out.println("Isosceles triangle");
        }
        else {
            System.out.println("Scalene triangle");
        }
    }
}
