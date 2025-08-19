


import java.util.Scanner;

public class Taking_input {
    public static void main(String[] args) {         //int sum = a + b;
        //System.out.println("the sum is");
        //System.out.println(sum);
        //For float
        Scanner S = new Scanner(System.in);
        System.out.println("enter number 1");
        float a = S.nextFloat();
        System.out.println("enter number 2");
        float b = S.nextFloat();
        float sum = a + b;
        System.out.println("the sum is");
        System.out.println(sum);



    }
}
