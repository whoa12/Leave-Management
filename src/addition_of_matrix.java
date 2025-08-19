
import java.util.Scanner;
public class addition_of_matrix {
    public static void main(String[] args) {
        int a[][], b[][], c[][], i , j;
        a = new int[3][3];
        b = new int[3][3];
        c = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array 1");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter array 2");
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("sum");
        for ( i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j]);
            }
        }

    }
}

