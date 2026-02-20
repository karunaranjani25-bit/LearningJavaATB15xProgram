package Exam_11thJan_2026;

public class Ex_13_Continue {

    public static void main(String args[]) {

    int n =1;
    while(n<=10){
        if(n==5){
            n++;
            continue;
        }
        System.out.println(n);
        n++;
    }

    }
}
