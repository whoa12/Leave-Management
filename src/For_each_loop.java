public class For_each_loop {
    public static void main(String[] args) {
        int[] marks ;
        marks = new int [3]; //initializing the array of size 3
        marks[0] = 60;
        marks[1] = 89;
        marks[2] = 90;
        System.out.println("printing using the loop");
        for (int i = 0; i< marks.length;i++) {
            System.out.print(marks[i]);
        }
            System.out.println("in reverse order");
            for (int b = 2; b>=0; b-- ){
                System.out.println(marks[b]);
            }
        }
    }

