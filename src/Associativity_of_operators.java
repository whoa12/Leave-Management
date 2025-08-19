public class Associativity_of_operators {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int c = 8;
        int d = b*b - (4*a*c)/(2*a);
        System.out.println(d);
        // the operator goes from left to right according to precedence order.
        // * and / have the highest precedence order.
    }
}
