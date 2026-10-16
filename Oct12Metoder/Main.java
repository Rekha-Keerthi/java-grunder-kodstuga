package Oct12Metoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Övning 2 – Pizzakalkylatorn Skapa en metod som räknar ut vad en pizzabeställning kostar. */

        Pizzakalkylatorn margharita = new Pizzakalkylatorn();
        Scanner s = new Scanner(System.in);
        System.out.println("Choose the menu number: ");
        int pizzachoice = s.nextInt();
        String currency = "Kr";
        int sumofpizzas = 0;
        int pizzachoosen  = margharita.beraknaPris(pizzachoice,2, 129);
        sumofpizzas = sumofpizzas + pizzachoosen;
        System.out.println("Total price " + sumofpizzas + currency);


        //Övning 4 – Den hungriga hunden
        Dog frasse = new Dog();
       
        frasse.showHunger();
        frasse.eat();
        frasse.showHunger();
        frasse.eat();


        /* Övning 3 – Superhjältekraft
        En superhjälte har olika egenskaper som tillsammans avgör hur stark hjälten är.*/

        Superhjalte sOne = new Superhjalte();
        System.out.println("Enter the Strength");
        Scanner strengthlevel = new Scanner(System.in);
        int strength = strengthlevel.nextInt();
        System.out.println("Enter the Speed");
        Scanner Speedlevel = new Scanner(System.in);
        int speed = Speedlevel.nextInt();

        int totalPower = sOne.powerLevel(strength,speed );
        System.out.println("Power Level " + totalPower);


        /*
        Player
         */

        Player player1 = new Player();
        player1.setScore(50);
        
        //player1.score=49;
        int scoreValue = player1.getScore();
        System.out.println("The score is : " + scoreValue);


        /*Method Overloading */

        Overloading callMethod = new Overloading();
        System.out.println(callMethod.showPower(10));
        System.out.println(callMethod.showPower("Jumping"));


        /*Boss Fight */
        //Attacking monster one
        Monster m1 = new Monster();
        Monster m2 = new Monster();

        Monster.fight();
        m1.attack(20);
        System.out.println("Monster Health:" + m1.monsterLife());

        //Attacking new monster by creating a new objekt. For every newly created monster objeckt, initial values are set to the class properties or attributes and methods
        
        Monster.fight();
        m2.attack(80);
        System.out.println("Monster Health:" + m2.monsterLife());

        //since the first monster is already attacked the remaining monsterlife value will be saved in the objekt.
        m1.attack(50);
        System.out.println("Monster Health:" + m1.monsterLife());


    }
    
}
