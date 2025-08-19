public class Hanoi_recursions {
    public static void Hanoi(String src, String hlp, String dest, int n){
        if(n == 1){
            System.out.println("transfer disc" + n + "from" + src + "to" + dest);
            return;

        }
        Hanoi(src, dest, hlp, n-1);
        System.out.println("transfer desc" + n + "from" + src + "to" + dest);
        Hanoi(hlp, src, dest, n -1);

        }

    public static void main(String[] args) {

        Hanoi("Source" , "helper" , "destination" , 3);

    }
    }

