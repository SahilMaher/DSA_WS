/**
 * P1979
 */
import java.util.*;
public class P1979 
{
    public static void main(String[] args) 
    {
        int[] arr={6,7,9};
        int len=arr.length;
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[len-1];
        if(max%min==0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        
    }

    
}