import java.util.Scanner;
public class else_if {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>60){
            System.out.println("you are a senior citizen");
        }
        else if (age>18){
            System.out.println("you are an adult!");
        }
        else {
            System.out.println("you are just a child!");
        }



        
    }
}
