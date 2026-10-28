package SpaceStation;

public class Airlock extends Sections{

    boolean userAcess=true;
    boolean oxygenLeakage ;
    boolean oxygenLeakageIsFixed=true;
    
    Airlock(String nameOfSection, int energy, int oxygenLevel) {
        
        super(nameOfSection, energy, oxygenLevel);
    }

    @Override
    void display() {
        System.out.println("Entering the Airlock Section of the Space Station");
        System.out.println("Energy level of the Airlock Section is : " + energy);
        System.out.println("Oxygen level of the Airlock Section is : " + oxygenLevel);
    }

    public void oxygenLeakage()
    {           
        if (this.oxygenLevel < 50)
        {   
             //update the status of the oxygenLeakage fixed to true
            this.oxygenLeakage= true;
        }
        else
        {
            this.oxygenLeakage= false;
           
        }
        System.out.println("Crew has fixed the oxygen leakage: " + oxygenLeakageIsFixed);
    }
}
