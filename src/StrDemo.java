import java.lang.StringBuffer;
public class StrDemo {
    public static void main(String[] args) {
        String s1 = new String("abc"); //creates an object in heap and scp
        StringBuilder sb = new StringBuilder("pqr");
        byte [] b = {103, 108, 106};
        String s3 = new String(b);   //this implies that byte can be converted to a string
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(sb);
        System.out.println(s3);


    }
}
