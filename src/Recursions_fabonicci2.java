import java.util.Scanner;
public class Recursions_fabonicci2 {
    public static int Fab(int n){
        if(n == 1){
            return 0;


        }if(n == 2){
            return 1;
        }else{
           return Fab(n-1) + Fab(n -2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Fab(n);

        System.out.println(ans);

    }
}
