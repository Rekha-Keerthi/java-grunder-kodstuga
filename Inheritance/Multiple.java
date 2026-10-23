package Inheritance;

 interface Multiple {
    default void interfaceType(){
        System.out.println("This is the interface type");
    
    }
}

interface Vehicle{
    default void vehicleType(){
        System.out.println("This is a vehicle type");
    }
}
    
    
class Bus implements Multiple, Vehicle{
    void busType(){
        System.out.println("This is car type vehicle");

    }
}

// Subclass 2: Hybrid inheritance (extends class + implements interface)
 