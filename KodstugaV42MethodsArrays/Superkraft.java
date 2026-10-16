package KodstugaV42MethodsArrays;

enum SUPERKRAFT {
    ELD, 
    IS, 
    VIND , 
    BLIXT

}
//noinspection SpellCheckingInspection
public class Superkraft {

    
    SUPERKRAFT superkraft;

    public Superkraft(SUPERKRAFT superkraft)
    {
        this.superkraft= superkraft;
    }
    
    public void superPower()
    {
        switch (superkraft) {
                case VIND:
                    System.out.println("Superpower is " + superkraft);
                    break;
                case ELD:
                    System.out.println("Superpower is " + superkraft);
                    break;
                case IS:
                    System.out.println("Superpower is " + superkraft);
                    break;
                case BLIXT:
                    System.out.println("Superpower is " + superkraft);
                    break;
            
                default:
                    break;
            }
    }

    public void printSuperpowers()
    {   
        System.out.println("Print all the superpowers: ");
        for (SUPERKRAFT power : SUPERKRAFT.values())
        {
            System.out.println(power);
        }
    }

}