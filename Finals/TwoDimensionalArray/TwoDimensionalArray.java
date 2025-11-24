public class TwoDimensionalArray {
    public static void main(String[] args) {
        int twoD[][] = new int[3][2];

        for( int row = 0; row <= 2; ++row ){
            for(int col = 0; col <= 1; ++col){
                twoD[row][col] = row + col;
            }
        }


         for( int row = 0; row <= 2; ++row ){
            for(int col = 0; col <= 1; ++col){
                twoD[row][col] = row + col;
                System.out.print("[" + twoD[row][col] + "]");
            }
            System.out.println();
        }
       
    }
}
