package ex_06_TernaryOperator;

public class Lab069_CLI_INPUTS {

    // Ternary Operator (No if-else allowed)
    // Problem
    //Write a Statement that returns:
    //  int marks = 100;
    //"PASS" if marks ≥ 40
    //"FAIL" otherwise

    public static void main(String[] args) {
        //int marks = 30;
        String input = args[0];
        int marks = Integer.parseInt(input);
        String result  = (marks >=40) ? "PASS" : "FAIL";
        System.out.println(result);
    }
}
