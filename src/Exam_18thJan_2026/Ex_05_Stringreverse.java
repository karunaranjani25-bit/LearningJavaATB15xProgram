package Exam_18thJan_2026;

import org.w3c.dom.ls.LSOutput;

public class Ex_05_Stringreverse {

    public static void main(String args[]){

        StringBuilder s1 = new StringBuilder("HelloWorld");
        String rev = "";
        for(int i =s1.length()-1;i>=0;i--){
            rev = rev+s1.charAt(i);

        }
        System.out.println("Using for loop: "+rev);

        //using string built in function
        StringBuilder strrev = new StringBuilder();
        strrev = s1.reverse();
        System.out.println("Using String built in function: "+strrev);

    }
}
