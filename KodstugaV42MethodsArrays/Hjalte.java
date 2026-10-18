package KodstugaV42MethodsArrays;

public class Hjalte {

    private int point;
    
    public int getHjalte()
    {
        return  point;
    }

    public void setHjalte(int point)
    {
        this.point = point;
    }
    
    
    
    public int highestScore(int[] arr)
    {
        int max = arr[0];
        for( int i=1 ; i < arr.length-1; i++)
        {
            if(arr[i] > max){
                max=arr[i];
            }
            
        }
        return max;
    }
    

    
}
