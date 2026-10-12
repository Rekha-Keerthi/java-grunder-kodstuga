package Oct12Metoder;

import java.util.Scanner;

public class Superhjalte {

    static int powerLevel(int strength, int speed)
    {
        
            int distCovered = strength + speed;
            return  distCovered;
        
    }

    public static void main(String[] args) {
        Superhjalte sOne = new Superhjalte();
        System.out.println("Enter the Strength");
        Scanner strengthlevel = new Scanner(System.in);
        int strength = strengthlevel.nextInt();
        System.out.println("Enter the Speed");
        Scanner Speedlevel = new Scanner(System.in);
        int speed = Speedlevel.nextInt();

        int totalPower = sOne.powerLevel(strength,speed );
        System.out.println("Power Level " + totalPower);
    }
    
}
