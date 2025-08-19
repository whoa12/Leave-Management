public class increasingArray_recursions {
    public static boolean Array(int arr[] , int j){
        if(j == arr.length - 1 ){
            return true;
        }

        if(arr[j ] < arr [j + 1]){
            return Array( arr, j+1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 7, 8, 9, 10};
        System.out.println(Array(arr, 0));
    }



}