package Rymdstation;

import java.util.Scanner;

public class Mission  {


public static void main(String[] args) {
        String[] crewMembers = new String[3];
        System.out.println("Enter the crew members name");
        Scanner s = new Scanner(System.in);
        for (int i=0; i < crewMembers.length ; i++)
        {
            crewMembers[i] = s.nextLine();
        }

        System.out.println("Crew members who are working in the Station");
        for (String crew : crewMembers)
        {
            System.out.println(crew);
        }

        System.out.println("Enter te same oxygen level of all crew members before fixing the oxygen leakage");
        int oxygenLevel = s.nextInt();


        Crew members = new Crew(crewMembers, oxygenLevel, true);
    
       Fixreactor mission = new Fixreactor();
       mission.startMission(members.crewNames);
        

}

    
    
}
