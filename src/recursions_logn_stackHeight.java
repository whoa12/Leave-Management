public class recursions_logn_stackHeight {
    public static int CalcPow(int x, int n) {
           if(n == 0){
               return 1;
           }
           if(x == 0){
               return 0;
           }
            if (n % 2 == 0) {                                                  // even n
                return CalcPow(x, n / 2) * CalcPow(x, n / 2);
            }
            else {    // odd n
                return CalcPow(x, n / 2) * CalcPow(x, n / 2) * x;
            }
        }

    public static void main(String[] args) {
        int ans = CalcPow(2, 5);
        System.out.println(ans);
    }
            }




