import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr;
        arr = new int[10];

        int i, c1=0, c2=0;
        for( i =0; i<n; i++){
            arr [i] = sc.nextInt();
        }
        if(arr[i]%2 == 0){
            ++c1;
        }else{
           ++ c2;
        }
        if(c1<c2){
            System.out.println("READY");
        }else{
            System.out.println("NOT READY");
        }


    }
}

