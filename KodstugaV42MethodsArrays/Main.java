package KodstugaV42MethodsArrays;

public class Main {
    
    /*Övning 6 – Bygg ett litet spel! */
    public static void main(String[] args) {
        int[] pointValues = {10, 20, 5, 50, 15};
        int sumOfPoints= 0;
        for ( int i = 0; i < pointValues.length-1 ; i++)
        {
            
            sumOfPoints = sumOfPoints + pointValues[i];
        }
        Hjalte  h = new  Hjalte();
        System.out.println("Övning 6  Bygg ett litet spel!");
        System.out.println();
        System.out.println("sum of all the pointvalues");
        h.setHjalte(sumOfPoints);
        System.out.println(h.getHjalte());
        System.out.println("Highest of all the points is: " + h.highestScore(pointValues));
        System.out.println("--------------------------------------------------------");

        /*Övning 1 – Hälsa på din robot! */
        System.out.println("Övning 1 Hälsa på din robot! *");
        System.out.println();
        Robot robo = new Robot();

        System.out.println(robo.halsa("Thor"));
        System.out.println(robo.favoritNumber(75));

        System.out.println(robo.halsa("Zing"));
        System.out.println(robo.halsa("Bob"));
        System.out.println("--------------------------------------------------------");

        /*Övning 2 – Godisräknaren */
        System.out.println("Övning 2 Godisräknaren *");
        System.out.println();
        GodisCounting bilar = new GodisCounting();
        String currency = "kr";
        double bilarTotalt = bilar.raknaPris(3, 30);
        System.out.println("Total pris av bilar  Godis är:  "+ bilarTotalt + currency);

        System.out.println("Total pris for bilar with fixed pris per bit: " + bilar.raknaPris(5));
        System.out.println("--------------------------------------------------------");

        /*Övning 4 – Hitta den hemliga skatten! */
        System.out.println("Övning 4 – Hitta den hemliga skatten!");
        System.out.println();
        int[] goldArray = {2351,999,5463, 2412,5331};
        String krona = "Kr";
        GoldTreasure goldpris = new  GoldTreasure();
        System.out.println("Total pris av gold är: " + goldpris.raknaGuld(goldArray));
        System.out.println("Maximum price of all the gold pris list: " + goldpris.maxGoldpris(goldArray));
        System.out.println("--------------------------------------------------------");


        /*Övning 5 – Välj din superkraft! */
        System.out.println("Övning 5 Välj din superkraft!");

        Superkraft superkraft1 = new Superkraft(SUPERKRAFT.BLIXT);
        superkraft1.superPower();
        
        superkraft1.printSuperpowers();
    }
    
}
