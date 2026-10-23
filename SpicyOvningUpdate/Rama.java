package SpicyOvningUpdate;

public class Rama extends Health implements Action{

    

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
         
            healthAfterAttack(damagePointsfromArrow);
    }

    @Override
    public void spiderAttack()
    {
        
        healthAfterAttack(damagePointsfromSpider);
    }

    @Override
    public void wildanimalsAttack() {
       healthAfterAttack(damagePointsfromWildAnimals);
    }

    @Override
    public void monkeyAttack()
    {
        
         healthAfterAttack(damagePointsfromMonkeys);
    }
    public void  updateArrowafterAttack()
    {
        noOfArrows = noOfArrows - 1;
        System.out.println("No of arrows remaining with Ravana after attack: " + noOfArrows);

    }
}
