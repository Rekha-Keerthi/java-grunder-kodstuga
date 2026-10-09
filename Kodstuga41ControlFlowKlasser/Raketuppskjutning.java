package Kodstuga41ControlFlowKlasser;

public class Raketuppskjutning {
    public static void main(String[] args) {
        
        System.out.println("Counter starts!");
        
        for ( int i=10; i >=1; i--)
        {
            
            if (i==5)
            {
                continue;
            }
            else if (i==1)
            {
                System.out.println(i);
                System.out.println("LIFTOFF");
                break;
            }
            
            System.out.println(i);
        }
    }
    
}
