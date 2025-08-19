import java.util.Scanner;
public class Multiplication_of_matrices {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        int i, j, k;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st array");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the second array");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("resultant:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    c[i][j] = sum + a[i][k] * b[k][j];
                    System.out.print(c[i][j]);
                    System.out.print(" ");
                }
            }

        }
    }
}



