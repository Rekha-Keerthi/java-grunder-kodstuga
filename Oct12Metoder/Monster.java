package Oct12Metoder;

public class Monster {

    public  static void attack()
    {
        System.out.println("Attack");

    }

    public  static void attack(int damage)
    {
        attack();
        System.out.println("Monster has attacked and damaged " +damage + "he is dead");
        
    }

    public int harm(boolean x)
    {
        if(x==true)
        {
            return 100;
        }
        else
        {
            return 0;
        }
    }
    

    public static void main(String[] args) {
        Monster m = new Monster();
        attack();
        m.attack(100);
        m.harm(true);

        
    }
}
