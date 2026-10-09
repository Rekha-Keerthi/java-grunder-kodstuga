package Kodstuga41ControlFlowKlasser;



public class Pet {

    private String name;
    private int hunger;
    private int energy;
    

    public Pet(String name, int hunger, int energy)
    {
        
        this.name = name;
        this.hunger = hunger;
        this.energy = energy;
    }

    public  void eat()
    {
        hunger = hunger - 20;
        energy = energy + 10;

        if (hunger>=50)
        {   
            
            System.out.println( "Hunger level is " + hunger +  " "+  name + " complains I am hungry");
            
        }
        else if (hunger >20 && hunger<50)
        {
            System.out.println( "Hunger level is " + hunger +  " "+ name + "  is not hungry");
        }
        else   
        {
           
            System.out.println( "Hunger level is " + hunger + " "+  name + " is full");
        } 

    }

    public void play()
    {
        
        if (energy <=20 )
        {   
            System.out.println("Energy level is " + energy +  " "+  name + "  do not have energy to play");
            
        }
        
        
        else   
        {
            energy = energy +20;
            hunger = hunger +15;

           System.out.println( "Energy level is " + energy +  " "+  name + " is happy and active to play");
        } 
    }

    public static void main(String[] args) {

       Pet petOne = new Pet("Frasse", 50, 20);
       petOne.eat();
       petOne.play();

       Pet petTwo = new Pet("Molly", 20, 50);
        petTwo.eat();
        petTwo.play();
        
    }

    
}
