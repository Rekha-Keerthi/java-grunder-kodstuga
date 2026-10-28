package SpaceStation;

abstract class CrewTeam {

    String name;
    int energy;

     CrewTeam(String name, int energy){
        
        this.name = name;
        this.energy = energy;
    }

    int getEnergy()
    {
        return energy;
    }

    String getName(){
        return name;
    }

    public void energyloss(int decrement)
    {
        energy = energy - decrement;
    }

    abstract void fixReactor();
    abstract void fixoxygenLeakage();
   
}
