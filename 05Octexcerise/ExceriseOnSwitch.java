import java.util.Scanner;

public class ExceriseOnSwitch {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        switch (num) {
            
            case 1:
                System.out.println("number is " + num);
                break;
            case 2:
                System.out.println("number is " + num);
                break;
            case 3:
                System.out.println("number is " + num);
                break;
        
            default:
                System.out.println("Invalid number");
                break;
        }
    }
    
}
