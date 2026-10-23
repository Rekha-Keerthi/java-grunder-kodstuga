package Vecka43Ovning;

abstract class Trees {
    float height;

    abstract void describe();

    Trees(float height)
    { 
        this.height = height;

    }
    
}


class Oak extends Trees{

    Oak(float height)
    {
        super(height);

    }

    @Override
    void describe() {
        System.out.println("Ekkoren gillar att äta oak träds akron");
        System.out.println("Oak spread very wide and can grow upto" + height + " meters tall");
    }

}

class Pine extends Trees{

    Pine(float height)
    {
        super(height);

    }

    @Override
    void describe() {
        System.out.println("Ekkoren gillar också äta pine nuts");
        System.out.println("Pine tree can grow maximum " + height + " meters tall");
    }

}