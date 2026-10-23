package SpicyProjectBackup;

public class Rama extends Health implements Action{

    int damagePointsfromArrow=10;
    int damagePointsfromSpider = 5;
    int damagePointsfromMonkeys= 10;
    int damagePointsfromWildAnimals= 7;

   Rama( int noOfArrows, int characterHealth ) {

        super(noOfArrows,characterHealth);
        
    }


    @Override
    public  void damage(int weaponChoice){
      
           switch (weaponChoice) {
                case 1: 
                        attackWithArrows();
                        break;       
                case 2:
                         spiderAttack();
                        
                        break;
                case 3: monkeyAttack();
                        break;
                
                case 4: wildanimalsAttack();
                    
                        break;

                default:
                    break;
            }
       } 
    

     @Override
    public  void attackWithArrows()
    {
         
            characterHealth = characterHealth - damagePointsfromArrow;
            System.out.println("Rama's Health after attack");
            getDetailsofCharacter();

         
    }

    @Override
    public void spiderAttack()
    {
        
         characterHealth = characterHealth - damagePointsfromSpider;
            System.out.println("Rama's Health after attack");
            getDetailsofCharacter();
    }

    @Override
    public void wildanimalsAttack() {
        characterHealth = characterHealth - damagePointsfromWildAnimals;
        System.out.println("Rama's Health after attack");
           
        getDetailsofCharacter();
    }

    @Override
    public void monkeyAttack()
    {
        
         characterHealth = characterHealth - damagePointsfromMonkeys;
            System.out.println("Rama's Health after attack");
            getDetailsofCharacter();
    }
    public void  updateArrowafterAttack()
    {
        noOfArrows = noOfArrows - 1;
        System.out.println("No of arrows remaining with Ravana after attack: " + noOfArrows);

    }
}
