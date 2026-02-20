package Exam_11thJan_2026;

public class Ex_10_PrintEvenNum_DoWhile {
    public static void main(String[] args) {

        int i = 1;
        System.out.println(" Even numbers between 1 and 50 are ");
        do{
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }while(i<=50);
    }
}
