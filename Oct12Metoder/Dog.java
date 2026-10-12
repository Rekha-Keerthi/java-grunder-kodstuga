package Oct12Metoder;

public class Dog {
    int hunger=100;

    

    void  eat()
    {
        
            hunger = hunger -10;
        
    }

    void  showHunger()
    {
        if (hunger>0 && hunger<30)
        {
            System.out.println("The Pet is  hungry ");
            System.out.println("Hundens hunger: " + hunger);
            
            
        }
        else if (hunger >=30)
        {
            System.out.println("The Pet is not hungry");
            System.out.println("Hundens hunger: " + hunger);
        }
        
    }


    public static void main(String[] args) {
        Dog frasse = new Dog();
       
        frasse.showHunger();
        frasse.eat();
        frasse.showHunger();
        frasse.eat();
    }
    
}
