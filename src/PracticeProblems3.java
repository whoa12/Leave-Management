import java.util.Scanner;
public class PracticeProblems3 {
    public static void main(String[] args) {
        long i;
        System.out.println("Enter your income.");
        Scanner sc = new Scanner(System.in);
        i = sc.nextLong();
        if (i>=1000000){
            System.out.println("your calculated tax is");
            float t = i*3/10.0f;
            System.out.println(t);
        }
        else if(i>=500000 && i<999999){
            System.out.println("your calculated tax is:");
           float t = i/5.0f;
            System.out.println(t);
        }
        else if (i>=250000 && i<=499999){
            System.out.println("your calculated tax is:");
           float t = i/20.0f;
            System.out.println(t);
        }
        else {
            System.out.println("you don't need to pay the tax!");
        }
    }
}
