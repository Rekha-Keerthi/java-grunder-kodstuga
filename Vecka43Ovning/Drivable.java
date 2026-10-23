package Vecka43Ovning;

public interface Drivable {

     void drive();
    
}


class Car implements   Drivable{
    @Override 
   public  void drive()
    {
        System.out.println("The car is drivable through manual gear or automatic");
    }

}

class Bicycle implements Drivable{
    @Override 
   public  void drive()
    {
        System.out.println("We can drive bicycle by peddling");
    }

}


class Scooter implements Drivable{
    @Override 
   public  void drive()
    {
        System.out.println("We can drive scooter by using an handle");
    }
}