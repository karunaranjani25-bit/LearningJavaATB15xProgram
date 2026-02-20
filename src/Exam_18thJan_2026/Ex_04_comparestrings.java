package Exam_18thJan_2026;

public class Ex_04_comparestrings {

    public static void main(String args[]){
        String str1 = "Welcome to Java";
        String str2 = "welcome to java";
        String str3 = "Welcome to Java";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str1.contentEquals(str3));
    }
}
