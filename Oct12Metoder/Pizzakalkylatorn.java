package Oct12Metoder;

import java.util.Scanner;

public class Pizzakalkylatorn {

    

    static int beraknaPris(int pizzachoice, int pizzor, int pizzaprice){
        

        switch (pizzachoice) {
            case 1: System.out.println("User has choosen "+    1);
                    int margharitaPrice =  pizzor *pizzaprice;
                    return  margharitaPrice;
                    
            case 2: System.out.println("User has choosen "+    2);
                    int pepparoniPrize =   pizzor *pizzaprice;
                    return  pepparoniPrize;
      
            default:
                System.out.println("Not available in the menu");
                return 0;
        }

    }

    public static void main(String[] args) {
        Pizzakalkylatorn margharita = new Pizzakalkylatorn();
        Scanner s = new Scanner(System.in);
        System.out.println("Choose the menu number: ");
        int pizzachoice = s.nextInt();
        String currency = "Kr";
        int sumofpizzas = 0;
        int pizzachoosen  = margharita.beraknaPris(pizzachoice,2, 129);
        sumofpizzas = sumofpizzas + pizzachoosen;
        System.out.println("Total price " + sumofpizzas + currency);
    }
    
}
