import java.util.*;
public class bubble_sorting {
    public static void main(String[] args) {
        int arr[] = {90, 89, 56, 67, 78};
        for (int i = 0; i<arr.length-1; i ++){
            for (int j = 0; j<arr.length-i-1; j++){
                if (arr[j] > arr [j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println(temp);


                }




            }
        }
    }
}
