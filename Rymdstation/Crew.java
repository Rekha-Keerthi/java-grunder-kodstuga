package Rymdstation;

import Oct05ControlFlow.blockscope;

 public  class Crew {

     String[] crewNames;
     int energy=100;
     int oxygenlevel;
     boolean userAccess;
     boolean oxygenLeakage = true;
     boolean oxygenLeakageIsFixed = true;
     

    //STATION[] stages = {STATION.START, STATION.AIRLOCK, STATION.LAB, STATION.REACTOR};

    Crew(String[] crewMemberNames, int oxygenlevel, boolean userAccess)
    {
        this.crewNames = crewMemberNames;
        this.oxygenlevel = oxygenlevel;
        this.userAccess = userAccess;
        
    }
    
    
 
    int energyloss(int amount)
    {
        energy= energy - amount;
        return energy;
    }

    int updateOxygenLevel( int increment)
    {
        oxygenlevel = oxygenlevel + increment;
        return oxygenlevel;
    }

    
}
