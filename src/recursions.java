public class recursions {
    public static void printNumb(int n){
        if(n ==6) {
            return; //base
        }
            System.out.println(n);
            printNumb(n+1);    // print

        }



    public static void main(String[] args) {
int n = 1;
printNumb(n);   //recursion
    }
    }


