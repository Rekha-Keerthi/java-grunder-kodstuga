package SpaceStation;

public class MissionToFix {

    CrewTeam[] team;
    STATION[] stages = {STATION.START, STATION.AIRLOCK, STATION.LAB, STATION.REACTOR};


    public void startMission(CrewTeam[] team, Sections[] section)
    {
        for (STATION room: stages){
            switch (room) {
                case START: 
                            

                    
                    break;

                case AIRLOCK:
                    
                    break;
            
                default:
                    break;
            }
        }

    }
    
}
