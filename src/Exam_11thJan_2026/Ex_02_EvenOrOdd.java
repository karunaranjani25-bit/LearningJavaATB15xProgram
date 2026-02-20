package Exam_11thJan_2026;
import java.util.*;

public class Ex_02_EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = scanner.nextInt();

        if(n%2==0){
            System.out.println(n+" is Even number");
        }
        else
            System.out.println(n+ " is odd number");
    }
}
