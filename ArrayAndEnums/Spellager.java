package ArrayAndEnums;



public class Spellager {


    public static void main(String[] args) {

        String[] weapons = {"Sword", "Shield", "potion", "hockey Stick", "Gun"};

        System.out.println("First and last element are :" + weapons[0] + "and " + weapons[4]);
        

        weapons[2] = "Hammer";

        System.out.println("The length of the array :" + weapons.length);
        

        for ( String element : weapons)
        {
            System.out.println(element);
        }

    }


    
}
