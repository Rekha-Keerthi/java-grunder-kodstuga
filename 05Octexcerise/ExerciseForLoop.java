

public class ExerciseForLoop {
    public static void main(String[] args){
        for ( int num=1; num<=10; num++){
            System.out.println(num);
        }


        for (int i = 1; i<=5; i++){
            if (i==3){
                System.out.println("If the number is equal to 3 "+i);
                break;
            }
        }


        for (int i = 1; i<=5; i++){
            if (i!=3){
                System.out.println("Continue untile the conditions is true!" + i);
                continue;
            }
        }
    }
    
}
