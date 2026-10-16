package Oct12Metoder;

import java.util.Scanner;

public class Pizzakalkylatorn {

    

    public int beraknaPris(int pizzachoice, int pizzor, int pizzaprice){
        

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

    
}
