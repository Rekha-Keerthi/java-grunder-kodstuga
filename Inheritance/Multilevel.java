package Inheritance;

public class Multilevel {
    Multilevel()
        {
            System.out.println("This is a vehicle");
        }

}


class FourWheeler extends Multilevel{
    FourWheeler()
    {
        System.out.println("The vehicle has 4 wheels");
    }
}

class Tempo extends FourWheeler
{
    Tempo()
    {
        System.out.println("This 4 wheeler vehicle is Tempo");
    }
}


