package SpicyOvningUpdate;

abstract class Health {

    //instance variable
    //shared attribute fom both the characters
    
    int characterHealth;
    int noOfArrows;
    
    //Constructor which initializes the constructor parameter to the object's instance variable
    Health(int noOfArrows, int characterHealth)
    {
        this.noOfArrows= noOfArrows;
        this.characterHealth = characterHealth;
        
    }


    //getter method to display the remaining lives and arrows after an attack
    void getDetailsofCharacter(){
        
     
        System.out.println("Health: " + characterHealth);
        System.out.println("No of arrows reamining: " + noOfArrows);

    }


    abstract void damage(int weaponChoice);

    

    public  void healthAfterAttack(int attackedBy)
    {
        characterHealth = characterHealth - attackedBy;
        System.out.println("Rama's Health after attack");
           
        getDetailsofCharacter();
    }

    
}
