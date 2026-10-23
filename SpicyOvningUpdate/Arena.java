package SpicyOvningUpdate;

import java.util.Random;
import java.util.Scanner;

public class Arena {

    public static void main(String[] args) {

        //Welcome Banner
        System.out.println("RAM ENTERS THE LANKA FOREST!");
        System.out.println("YOU CAN EITHER PLAy AS RAVAN or RAM");
        
        //boolean ramEntered = true;
        

        //shared attribute fom both the characters
        int ramaslives = 100;
        int ravanslives = 100;
        int noOfArrows = 100;

        //asking the user input to different attack options
        Scanner s = new Scanner(System.in);

        System.out.println("Enter RAM or RAVAN as string input to choose who to attack ");
        System.out.println("1: RAM\n2: RAVAN");
        System.out.println("--------------------------------");
        int attackerID = s.nextInt();

        if(attackerID==1)
        {
         System.out.println("You have chosen to be RAM");   
        }
        else if (attackerID==2)
        {
            System.out.println("You have chosen to be RAVAN");
        }
        else
        {
            System.out.println("Invalid input");
            return ;
        }


        //Creating an object of Ravan and RAM where it implements and extends other classes
        Ravana ravan = new Ravana(noOfArrows, ravanslives);
        Rama ram = new Rama(noOfArrows, ramaslives);
        System.out.println("--------------------------------");
        System.out.println("RAM's HEALTH");
        ram.getDetailsofCharacter();
        System.out.println("--------------------------------");
        System.out.println("RAVANA's HEALTH");
        ravan.getDetailsofCharacter();

        
        while (ram.characterHealth >10 && ravan.characterHealth >10) 
        {
            System.out.println("\n");
            System.out.println("CHOOSE A WEAPON TO ATTACK FROM THE LIST");
            //choices to choose from terminal to attack
            System.out.println("1: ARROWS\n2: SPIDERS\n3: MONKEYS\n4: WILD_ANIMLAS");

            int weaponChoice = s.nextInt();
            String[] attackWith = {"attackWithArrows", "spiderAttack", "monkeyAttack", "wildanimals"};


            //Random choice of weapon chosen by computer as an opponent
            Random random = new Random();
            int computersWeaponChoice = random.nextInt(4) + 1;
            if(attackerID==2)
            {
                //Ravana is attacking RAMA
                if(weaponChoice==1)
                {
                    ravan.updateArrowafterAttack();
                }
                ram.damage(weaponChoice);
                

                //Since this is a One player game, Computer plays as RAMA and attacks RAVANA
                System.out.println("Weapon chosen by RAMA to attack RAVANA: " + attackWith[computersWeaponChoice-1]);
                if(weaponChoice==1)
                {
                    ram.updateArrowafterAttack();
                }
                ravan.damage(computersWeaponChoice);
                    
            }
            else if (attackerID==1)    {

                //RAMA is attacking RAVANA

                if(weaponChoice==1)
                {
                    ram.updateArrowafterAttack();
                }
                ravan.damage(weaponChoice);

                //Since this is a One player game, Computer plays as RAVANA and attacks RAMA
                System.out.println("Weapon chosen by RAVANA to attack RAMA: " + attackWith[computersWeaponChoice-1]);
                if(weaponChoice==1)
                {
                    ravan.updateArrowafterAttack();
                }

                ram.damage(computersWeaponChoice);
            }

       
        }


        if(ram.characterHealth <=10)
        {
            System.out.println("RAMA is dead");
        }
        
        if(ravan.characterHealth <=10)
        {
            System.out.println("RAVANA is dead");
        }
    }
}