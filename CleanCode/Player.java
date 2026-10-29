package CleanCode;

public class Player {

    private  String name ;
    private int health;
    private int coins;


    Player(String name, int health, int coins)
    {
        this.name = name;
        this.health = health;
        this.coins = coins;
    }

    
    public int heal(int amount)
    {   
        health = health + amount;
    
        return Math.min(health, 100);
    }

    public boolean canBuyPotion(int price){
        if (coins >=price)
        {
            System.out.println("Köpet lyckades. Kostnad: " + price + " coins.");
            return  true;
            
        }
        else
        {
            System.out.println("Du har inte tillräckligt med coins.");
            return false;
        }

    }

    public int buyPotion(int price){ 
        coins = coins-price;
            
        return coins;
    }

    public  void printStatus()
    {
        System.out.println("Player: " + name);
        System.out.println("Health: " + health);
        System.out.println("Coins: " + coins);
    }

    

    
}
