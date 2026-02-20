package Exam_18thJan_2026;

public class Ex01_CharCountwithoutspace {

    public static void main(String args[]){

        String s = "Welcome to JAVA";
        //System.out.println(s);
        int count = 0;
        for(int i=0;i< s.length();i++){
            if(s.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Total characters in given string without spaces: "+count);
    }
}
