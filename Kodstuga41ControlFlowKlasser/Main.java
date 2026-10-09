package Kodstuga41ControlFlowKlasser;

public class Main {

    public static void main(String[] args) {
            Monster m = new Monster("Gajani", 30);
            while(m.health>0)
            {
                if (m.health>0){
                    System.out.println("Simulate the attack "+ m.health);
                    m.health--;
                    continue;

                }
                
            }
            if(m.health==0)
            {
                    System.out.println("Monster has lost the engergi " + m.health);
                    
            }
        }

}
