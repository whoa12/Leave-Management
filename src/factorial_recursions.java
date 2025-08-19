public class factorial_recursions {
    public static int printFact(int i){
        if(i==1 || i == 0) {
            return 1;
        }
        int calc_nm1 = printFact(i-1);
        int factN = i*calc_nm1;
        return factN;

        }

    public static void main(String[] args) {
       int ans = printFact(5);
        System.out.println(ans);

    }

        }







