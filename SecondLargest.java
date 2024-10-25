
import java.util.*;
public class SecondLargest   
{
    public static  int getSecondLargest(int[] arr) 
    {
        Arrays.sort(arr);
        int val=arr.length-1;
         while(arr[val]==arr[val-1])
            {
                if(arr.length==2)
                {
                return -1;
                }
                else
                {
                   val--;
                }
            }
        return arr[val-1];
        
        // Code Here
    }
    public static void main(String[] args) 
    {
        new SecondLargest();
        int[] arr={1,2,3,4,5,5,3,3,7};
        int val=getSecondLargest(arr);
        System.out.println(val);
        
    }
}