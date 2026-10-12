package Oct12Metoder;

public class Dog {
    int hunger;

    public Dog(int hunger)
    {
        this.hunger = hunger;
    }

    void  eat(int hunger)
    {
        
            hunger = hunger -10;
        
    }

    void  showHunger()
    {
        if (hunger<30)
        {
            System.out.println("The Pet is  hungry " + hunger);
            eat(hunger);
            
        }
        else if (hunger >=30)
        {
            System.out.println("The Pet is not hungry");
            
        }
        
    }


    public static void main(String[] args) {
        Dog frasse = new Dog(50);
        frasse.eat(30);
        frasse.showHunger();
        
    }
    
}
