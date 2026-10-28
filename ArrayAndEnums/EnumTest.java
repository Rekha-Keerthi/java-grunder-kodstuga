package ArrayAndEnums;

public class EnumTest {

    Days day;

     EnumTest(Days day)
    {
        this.day= day;
    }
    

    public void tellItLikeItIS()
    {
        switch (day) {
            case Monday:
                System.out.println("Today is " + day);
                break;
            case Tuesday:
                System.out.println("Today is " + day);
                break;
            case Wednesday:
                System.out.println("Today is " + day);
                break;
            case Thursday:
                System.out.println("Today is " + day);
                break;
            case Friday:
                System.out.println("Today is " + day);
                break;
            case Saturday:
                System.out.println("Today is " + day);
                break;
            case Sunday:
                System.out.println("Today is " + day);
                break;
        
            default:
                break;
        }
    }
}
