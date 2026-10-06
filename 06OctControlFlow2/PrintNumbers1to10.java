

public class PrintNumbers1to10 {
    public static void main(String[] args) {

        /* a.	Write a program that uses a for loop to print the numbers from 1 to 10, one number per line.*/
        for (int i =1 ; i <= 10 ; i ++){
            System.out.println(i);
        }

        //b.	Write a program that uses a while loop to count and print the even numbers from 2 to 20.
        int num = 2;
        System.out.println("Print even numbers between 2 to 20");
        while(num<=20)
        {
            if (num % 2 == 0)
            {
                System.out.println("Even number is: " + num);
                
            }
            num++;
        }

        //c.	Write a program that uses a for loop to print the multiplication table of a given number (e.g., 5) up to 10 times.

        int multiple = 5;
        System.out.println("multiplication table of 5 is:");
        for ( int i = 1; i<=10; i++){
            System.out.println(multiple + " * " + i +" = " + (multiple * i));
        }

        //d.	Write a program that uses a while loop to count down from 10 to 1, printing each number.

        int givenNumber = 10;
        System.out.println("Print numbers from 10 to 1");
        while(givenNumber>=1)
        {
            System.out.println(givenNumber);
            givenNumber--;
        }

        //e.	Write a program that uses a for loop to calculate and print the sum of the first 10 odd numbers.

        int sum =0;
        for( int i=1; i<=10; i++)
        {
            if (i%2 !=0){
            sum = sum + i;
            
            continue;
            }
            
        }
        System.out.println("Sum of first 10 odd numbers is : " + sum);
        
    }
    
}
