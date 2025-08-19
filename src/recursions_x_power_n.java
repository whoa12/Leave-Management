public class recursions_x_power_n {
    public static int CalcPow(int x, int n){
        if(n == 0){
            return 1;

        }
        if (x == 0) {

            return 0;
        }
        int Pownm1 = CalcPow(x, n -1);
        int xPown = x * Pownm1;
        return xPown;

    }

    public static void main(String[] args) {
       int ans = CalcPow(2, 5);
        System.out.println(ans);
    }
}

