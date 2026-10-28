package CleanCode;

public class Koddetektiven {
    int coins = 100; 

    /*OVning Three */
static int totalCostOfPotion() { 
    
    int numberOfPotions = 2; 
    final int costPerPotion = 30;
    int totalCostForPotion = numberOfPotions * costPerPotion; 

    return totalCostForPotion;
}

public void canBuyPotion()
{
    int totalCost = totalCostOfPotion();
    if (coins >= totalCost) { 
        System.out.println("Köpet lyckades. Kostnad: " + totalCost + " coins."); 
        }
    else 
        { System.out.println("Du har inte tillräckligt med coins."); 

        }
}

public static void main(String[] args) {

      /*String x = "Mira"; int y = 3; double z = 30.0; double a = y * z; System.out.println(x + " köper drycker för " + a + " kr.");
· Byt ut x, y, z och a mot tydliga namn.
· Kör programmet före och efter. Utskriften ska fortfarande betyda samma sak.
· Jämför med en klasskamrat: valde ni samma namn? Om inte, vilket namn är tydligast? */

String personName = "Mira"; 
int numberOfDrinks = 3;
double pricePerDrink = 30.0;
double totalDrinkPrice = numberOfDrinks * pricePerDrink; 
System.out.println(personName + " köper drycker för " + totalDrinkPrice + " kr.");

/*Ovning 2: Magic Number Monster ´
. Skapa en konstant som beskriver vad 100 betyder.
· Använd konstanten i if-satsen.
· Fundera: blir koden lättare att söka efter och ändra senare?*/

int playerScore = 120; 
final int maxScore =100;
if (playerScore >= maxScore) {
    System.out.println("Level up!");
}



}

    
}
