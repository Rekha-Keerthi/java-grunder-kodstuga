package Rymdstation;

public class Fixreactor  implements InnerSections{

    
    @Override 
     public void startMission(String[] crewNames)
    {   
        for (String crew : crewNames)
        {
            for (STATION stage : stages)
            {
                if( crew =="flight engineer")
                {
                    switch (stage)
                    {
                    case START:
                            System.out.println("Mission has started");
                            //print the status as user has entered the station
                            //check user has entered the station
                            System.out.println(crew + " has entered the Station");
                            //check the energy level of the entered user
                            System.out.println("Energy level of the user is : " + energyloss(10));
        
                            //check the oxygen level of the user
                            if (oxygenlevel>=50)
                            {
                                System.out.println("Oxygen level of the user is : " + oxygenlevel);
                            }
        
                            else
                            {
                            System.out.println("Oxygen level of the user is low, please check the oxygen level");
                            }

                            break;

                    case AIRLOCK:
                                
                                //airlock();
                                //if user has access to the airlock room, then call the airlock method
                                if (userAccess )
                                {
                                    //print the user has entered the AIRLOCk station
                                    System.out.println( "Crew has entered the airlock room");
                                    if (oxygenLeakage)
                                    {
                                        
                                        //update the status of the oxygenLeakage fixed to true
                                        oxygenLeakageIsFixed = true;
                                        System.out.println("Crew has fixed the oxygen leakage: " + oxygenLeakageIsFixed);
                                    }
                                }
                                else     
                                {
                                    System.out.println("User does not have access to the Airlock Room");
                                }
                                // update the oxygen levels of all the crew members
                                System.out.println("Updated the oxygen levels of all the crews to : " +updateOxygenLevel(10));
                                //return the when the osygenleakage in boolean 

                                break;
                    case LAB:
                            
                            boolean IslabLocked = true;
                                //if the user has access to the LAB,
                            if (userAccess && oxygenLeakageIsFixed )
                            {
                                 //print on console the user has entered the LAB 
                                    System.out.println( crew +"has entered the LAB");
                                    System.out.println("update the oxygen level + "+  oxygenlevel);
                            }
                            // check whether the lab lock is set to locked initially
                            if( IslabLocked)
                            {
                                 IslabLocked = false;
                            }
                            System.out.println("User has unlocked the lab");
        
                        break;
                    case REACTOR:
                            System.out.println("Crew has entered the Reactor Room");
                            boolean isreacotrRepairable=true;
                            boolean Reactorrepaired=false;
                            //print the warning statement
                            System.out.println("Rymdstation 404");
                            //print the crew member has entered the reactor room
                            if(userAccess)
                            {
                                System.out.println("Crew has entered the reactor room");
                                //check if the reactor is repairable
                                if(isreacotrRepairable==true) {
                                    //if yes, repair the reactor and update the status of Reactorrepaired to true and print
                                    Reactorrepaired = true;
                                }
                                else
                                {
                                    Reactorrepaired = false;
                                    // else return the mission failed to repair the reactor
                                }
                            }
    
                            break;
                    default:
                        System.out.println("Invalid stage");
                    }
                }
        
            }
        }
    }
    
}
