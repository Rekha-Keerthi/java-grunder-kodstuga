package ArrayAndEnums;

public class Compass {

    enum Directions{
        
        NORTH,
        EAST,
        SOUTH,
        WEST
    }

   public static void main(String[] args) {

    //Directions myvalue = Directions.NORTH; 
    Directions myvalue = Directions.EAST; 

    switch (myvalue) {
        case NORTH:
            System.out.println("The direction is: " + myvalue);
            break;
        case SOUTH:
            System.out.println("The direction is: " + myvalue);
            break;
        case EAST:
            System.out.println("The direction is: " + myvalue);
            break;
        case WEST:
            System.out.println("The direction is: " + myvalue);
            break;
        default:
            break;
    }
    
    for (Directions myVar : Directions.values()) {
        System.out.println(myVar);
}

   }
    

    
    
}
