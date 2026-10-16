package ArrayAndEnums;

import java.util.Arrays;

public class Highscore {

    public static void main(String[] args) {
        int[] highScore = {150, 50, 100, 34, 99 };
        int sum = 0;

        //Använd en vanlig for-loop för att skriva ut alla poäng.
        for ( int i = 0 ; i <highScore.length; i++)
        {
            System.out.println("Scores in the list are : " + highScore[i]);
            sum = sum + highScore[i];
        }
        System.out.println("The total of all the points is : " + sum);
        //Använd Arrays.sort() för att sortera poängen.
        Arrays.sort(highScore);
        //Skriv ut den sorterade arrayen med Arrays.toString().
        System.out.println(Arrays.toString(highScore));


        //Skriv ut den högsta poängen efter sorteringen.
        System.out.println((highScore[highScore.length-1]));


    }
    
}
