package CleanCode;

public class PotionShop {

    public static void main(String[] args) {

        Player playerOne = new Player("Mario", 60 , 100);

        final int price =50;
        final int heal_amount = 10;

        System.out.println("Status before purchase :");
        playerOne.printStatus();

        if(playerOne.canBuyPotion(price))
        {
            playerOne.buyPotion(price);
            playerOne.heal(heal_amount);

        }
        else
        {
            System.out.println("You cannot buy the potion.");
        }

        System.out.println("Status after buying potion:");
        playerOne.printStatus();
        
        
    }
    
}
