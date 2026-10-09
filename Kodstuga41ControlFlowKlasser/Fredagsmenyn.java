package Kodstuga41ControlFlowKlasser;

public class Fredagsmenyn {
    public static void main(String[] args) {
        int choice =2;
        
        switch(choice){
            case 1: System.out.println("Pasta");
                    break;
            case 2: System.out.println("Vegetari Pizza");
                    break;
            case 3: System.out.println("Red Thai Curry");
                    break;
            case 4: System.out.println("Burger");
                    break;
            default : System.out.println("Invalid menu item");

        }

        
    }
    
}
