package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_Right_Aligned_Triangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = scanner.nextInt();

        for(int i = 0; i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int star=0;star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
