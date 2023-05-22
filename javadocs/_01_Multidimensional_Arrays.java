public class _01_Multidimensional_Arrays {
    public static void main(String[] args) {
        //    int [] floor = (1,2,3,4,); 1-D Array

        int i, j;
        int[][] flats;
        flats = new int[2][4];
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[0][3] = 103;
        flats[1][0] = 104;
        flats[1][1] = 105;
        flats[1][2] = 106;
        flats[1][3] = 107;
        System.out.println("Printing a 2-D array: ");
        for (i = 0; i < flats.length; i++) {
            for (j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}