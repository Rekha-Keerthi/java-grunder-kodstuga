package ArrayAndEnums;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputToArray {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the row");
        int row = s.nextInt();
        System.out.println("Enter the size of the column");
        int col = s.nextInt();

        int[][] arr  = new int[row][col];
        System.out.println("Enter the values to store in two dimensional array");
        for ( int i=0; i<row; i++)
        {
            for (int j=0; j<col; j++)
            {
                
                int value = s.nextInt();
                arr[i][j] = value;

            }
        }

        for ( int i=0; i<row; i++)
        {
            for (int j=0; j<col; j++)
            {
                
                System.out.println("array elements are  arr[" + row + "][" + col +"] ="+ arr[i][j]);
                

            }
            System.out.println();
        }
        
        
        
    }

    
    
}
