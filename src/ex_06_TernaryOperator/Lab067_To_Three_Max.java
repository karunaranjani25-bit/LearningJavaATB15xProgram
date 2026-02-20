package ex_06_TernaryOperator;

public class Lab067_To_Three_Max {

    public static void main(String[] args) {

        int n1 = 12;
        int n2 = 19;
        int n3 = 15;

        System.out.println("MAX OUT OF THREE: " +((n1>n2)&&(n1>n3)?n1:((n2>n3)?n2:n3)));

    }
}
