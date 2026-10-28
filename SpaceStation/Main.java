package SpaceStation;

public class Main {
    public static void main(String[] args) {

        FlightEngineer flightengineer = new FlightEngineer("Johan", 10);
        CrewTeam[] team = {flightengineer};

        
        Start start = new Start("START", 10, 50);
        Airlock airlock = new Airlock("AIRLOCK", 20, 40);

        Sections[] inroom = {start, airlock};

        start.display();
        airlock.display();
        airlock.oxygenLeakage();

        MissionToFix mission = new MissionToFix();
        mission.startMission(team, inroom);

        
    }
    
}
