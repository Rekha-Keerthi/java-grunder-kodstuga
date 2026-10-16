package ArrayAndEnums;

public class Skattjakten {
    

    public static void main(String[] args) {

        int[][] skattkarta = new int[3][3];

        skattkarta[2][1]= 1;

        for (int row = 0; row < skattkarta.length ; row++)
        {
            for ( int col = 0 ; col<skattkarta.length; col++)
            {
                //System.out.println("bonus are [" + row + "][" + col +"] =" + skattkarta[row][col]);
                System.out.println( skattkarta[row][col]);
            }
            System.err.println();
        }
        skattkarta[0][1]= 5;
        skattkarta[1][2]= 5;
       
        for (int row = 0; row < skattkarta.length ; row++)
        {
            for ( int col = 0 ; col<skattkarta.length; col++)
            {
                //System.out.println("bonus are [" + row + "][" + col +"] =" + skattkarta[row][col]);
                System.out.println( skattkarta[row][col]);
            }
            System.err.println();
        }
        
        
    }
}
