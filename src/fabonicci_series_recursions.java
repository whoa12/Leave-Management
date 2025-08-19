public class fabonicci_series_recursions {
    public static void printFab(int a, int b, int n){
       if(n == 0){
           return; //base
       }
        int c = a + b;
        System.out.println(c);
        printFab(b, c, n-1); // recursive function


    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFab(0, 1, n-2);
    }
}
// sabse pehle kaam likho (recursive function)
// base bhi likho
// 
