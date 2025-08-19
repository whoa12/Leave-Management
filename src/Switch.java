import java.util.Scanner;

public class Switch {
    static class Student{
        int age1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        Student s1 = new Student();
        s1.age1 = 19;
        switch (age) {
            case 18 -> System.out.println("you have passed your school!");
            case 60 -> System.out.println("you are now retired");
        }




    }
}
