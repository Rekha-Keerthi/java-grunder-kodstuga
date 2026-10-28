package CleanCode;

public class Player {

    String name ;
    int health;
    int coins;


    Player(String name, int health, int coins)
    {
        this.name = name;
        this.health = health;
        this.coins = coins;
    }

    
    public int heal(int amount)
    {   
        
        health = health + amount;
        return health;
    }

    public void canBuyPotion(int price){
        if (price >30)
        {
            System.out.println("Köpet lyckades. Kostnad: " + price + " coins.");
            buyPotion(price);
            printStatus();
        }
        else
        {
            System.out.println("Du har inte tillräckligt med coins.");
        }

    }

    public int buyPotion(int price){
        int decrement=10;
        if (price >30)
        {
            coins = coins-decrement;
            heal(10);
        }
        return coins;
    }

    public  void printStatus()
    {
        System.out.println("Player: " + name);
        System.out.println("Health: " + health);
        System.out.println("Coins: " + coins);
    }

    public static void main(String[] args) {

        Player playerOne = new Player("Mario", 60 , 100);

        int price =50;

        playerOne.canBuyPotion(price);
        
        
    }

    
}
