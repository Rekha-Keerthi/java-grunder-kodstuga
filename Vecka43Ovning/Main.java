package Vecka43Ovning;
public class Main {
    public static void main(String[] args) {
        Animal a = new Dog("Frasse");
    
        a.makeSound();
        Animal c = new Cat("Bixy");
        c.makeSound();

        Animal cow = new Cow("Lakshmi");
        cow.makeSound();


        //Ovning 3: 
        Drivable newcar = new Car();
        Drivable bike = new Bicycle();
        Drivable scooter = new Scooter();
        newcar.drive();
        bike.drive();
        scooter.drive();

        startTrip(new Car());


        //Ovning 2:
        Trees okatreeType = new Oak(40.5f);
        Trees pinetree = new Pine(83.45f);

        okatreeType.describe();
        pinetree.describe();



    }

    public static void startTrip(Drivable vehicle)
       { 
            vehicle.drive();
       }

    
}
