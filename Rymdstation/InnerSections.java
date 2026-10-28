package Rymdstation;


 public interface InnerSections {


    STATION[] stages = {STATION.START, STATION.AIRLOCK, STATION.LAB, STATION.REACTOR};


   
    abstract void startMission(String[] crewmembers);
    }



