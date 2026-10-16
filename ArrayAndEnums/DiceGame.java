package ArrayAndEnums;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DiceGame {

    public static void main(String[] args) {
        int[] dicerolled = { 1,6,4,5,2};

        int sum = 0;
        for ( int i= 0; i < dicerolled.length ; i++)
        {
            System.out.println(dicerolled[i]);
            sum = sum + dicerolled[i];
        }

        System.out.println("Sum of all the dice points is: " + sum);


        Arrays.sort(dicerolled);

        System.out.println("least value in the dice: " + dicerolled[0] );
        System.out.println("Highest value in the dice" + dicerolled[dicerolled.length-1]);

        System.out.println(Arrays.binarySearch(dicerolled, 6));

        int[] newdiceArray = Arrays.copyOf(dicerolled, 8);
        newdiceArray[6]=2;
        newdiceArray[7]=1;
        System.out.println(newdiceArray.length);

        System.out.println(Arrays.toString(newdiceArray));
        
        
        
    }
    
    
}
