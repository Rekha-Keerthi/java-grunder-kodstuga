package SpaceStation;

abstract class Sections {

    String nameOfSection;
    int energy;
    int oxygenLevel;
    

    Sections(String namSections, int energy, int oxygenLevel)
    {
        this.nameOfSection = nameOfSection;
        this.energy = energy;
        this.oxygenLevel = oxygenLevel;
    }

    abstract void display();

    
    
}
