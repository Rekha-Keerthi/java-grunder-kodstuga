package SpaceStation;

public class FlightEngineer extends CrewTeam {
    
    FlightEngineer(String name, int energy) {
        super(name, energy);
    }

    @Override
    public void energyloss(int decrement) {
        super.energyloss(decrement);
        System.out.println("Flight Engineer " + getName() + " has lost " + decrement + " energy points. Remaining energy: " + getEnergy());
    }

    @Override 
    public void fixReactor()
    {
        System.out.println("Flight Engineer " + getName() + " is fixing the reactor.");
        energyloss(20); // Flight Engineer loses 20 energy points while fixing the reactor
    }
    
    @Override 
    public  void fixoxygenLeakage()
    
    {
        System.out.println("Flight Engineer " + getName() + " is fixing the oxygen leakage.");
        energyloss(15); // Flight Engineer loses 15 energy points while fixing the oxygen leakage
    }

    public void hasAccess()
    {
        System.out.println("Flight Engineer " + getName() + " has access to the Airlock section.");
    }
}
