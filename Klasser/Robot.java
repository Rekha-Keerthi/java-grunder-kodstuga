package Klasser;

public class Robot {

    public String name;
    private int batteri;

    Robot(String name, int batteri)
     {
        this.name = name;
        this.batteri = batteri;
     }

     void visaStatus()
     {
        
        System.out.println("Robot name is: " + name + " and its battery is: " + batteri);
     }

    /*  public static void main(String[] args) {
        Robot roboOne = new Robot("Nemo", 1500);
        roboOne.batteri= 300;
        roboOne.visaStatus();
     }*/



    
}
