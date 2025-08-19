public class Multi_dim_arrays {
    public static void main(String[] args) {
        //"arrays in arrays"
        int [] [] flats;
        flats = new int [2][3];
        flats [0] [0] = 101;
        flats [0] [1] = 201;
        flats [0] [2] = 202;
        flats [1] [0] = 401;
        flats [1] [1] = 501;
        flats [1] [2] = 502;
        for (int i = 0; i<flats.length; i ++){
            for(int j = 0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");


            }
            System.out.println(" ");
        }




    }
}
