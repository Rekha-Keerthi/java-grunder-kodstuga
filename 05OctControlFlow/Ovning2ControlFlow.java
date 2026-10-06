public class Ovning2ControlFlow {
    public static void main(String[] args) {
            int result = 100;
        for (int i = 0; i < 100; i++) {
            if (i == 11)
                break;
            result = result - i;
        }


        System.err.println(result);
        //System.err.println(a);
    }
}
