package Exam_11thJan_2026;

public class Ex_14_SecondHighestinArray {

    public static void main(String args[]) {

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34
        int highest = 0;
        int secondhighest = 0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i]> highest){
                secondhighest = highest;
                highest = numbers[i];
            }
        }
        System.out.println("Second Highest value is : "+secondhighest);
        System.out.println("Highest value is: "+highest);
    }
}
