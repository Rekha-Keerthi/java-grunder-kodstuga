package KodstugaV42MethodsArrays;

public class GoldTreasure {

    public int raknaGuld(int[] goldArray)
    {
        int totalsumman = 0;
        for (int i = 0; i < goldArray.length; i++)
        {
            totalsumman = totalsumman+goldArray[i];
        }
        return  totalsumman;
    }

    public int maxGoldpris(int[] goldArray)
    {
        int max = goldArray[0];
        for (int i = 0; i < goldArray.length; i++)
        {
           if(goldArray[i] >max)
           {
            max = goldArray[i];
           }
        }
        return  max;
    } 
    
}
