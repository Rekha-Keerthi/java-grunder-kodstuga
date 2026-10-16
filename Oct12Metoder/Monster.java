package Oct12Metoder;

public class Monster {

    int monsterlivs = 100;

    public  static void fight()
    {
        System.out.println("Attack");

    }

    public  void attack(int damage)
    {
        
        monsterlivs = monsterlivs-damage;
        System.out.println("Monster was attacked and damaged ");

        if(monsterlivs <=0)
        {
            System.out.println("Monster is dead");
        }
        
    }

    public int monsterLife()
    {
      return monsterlivs;

    }

}
