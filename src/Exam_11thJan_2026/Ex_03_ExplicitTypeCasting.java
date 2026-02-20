package Exam_11thJan_2026;
import java.util.*;

public class Ex_03_ExplicitTypeCasting {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter double value: ");
        double d = scanner.nextDouble();

        int a = (int) d;
        System.out.println("Double value is : " +d);
        System.out.println("Int value is "+a);
    }

}
