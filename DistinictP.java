import java.lang.reflect.Array;
import java.util.Arrays;

public class DistinictP
{
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,1,2,3,4};
        int n=arr.length;
        Arrays.sort(arr);
        
        int j=0;
        for (int i = 0; i < n; i++)
        {
           for( j=0;j<i;j++)
           {
            if(arr[i]==arr[j])
            {
                break;
               
            }
            
           }
           if(i==j)
           {
            System.out.println(arr[i]);

           }
           
 
        }
        
    }
    
}
