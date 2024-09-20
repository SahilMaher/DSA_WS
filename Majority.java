import java.lang.reflect.Array;
import java.util.Arrays;

public class Majority
{
    public static void main(String[] args) 
    {
        int[] arr={3,2,3};
        int lead=0;
        int count=0;
    Arrays.sort(arr);  
    
        for(int i:arr)
        {
            if(count==0)
            {
                lead=i;
                count++;
            }
            else
            {
                count= i==lead?count+=1:count--;
            }
            
        }
        System.out.println("Leader"+lead+"\n"+count);
        
    }
    
}
