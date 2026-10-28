package SpaceStation;

public class Start extends  Sections{

    
    Start(String nameOfSection, int energy, int oxygenLevel) {
        super(nameOfSection, energy, oxygenLevel);
    }

    @Override
    void display() {
        System.out.println("Starting the Space Station Mission");
        System.out.println("Energy level of the Space Station is : " + energy);
        System.out.println("Oxygen level of the Space Station is : " + oxygenLevel);
    }
    
}
