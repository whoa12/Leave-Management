import java.util.Scanner;
public class Practice_problems{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter Marks1");
        int a = S.nextInt();
        System.out.println("enter Marks2");
        int b = S.nextInt();
        System.out.println("enter marks3");
        int c = S.nextInt();
        int percentage = (a + b + c)/3;
        System.out.println("the percentage is");
        System.out.println(percentage);


    }
}

