import java.util.Arrays;

public class P1590 
{
    public static int findSum(int[] nums,int p)
    {
        int len=nums.length;
        int val=20000;
        int sum=0;
        int indx=0;

        for(int i=0;i<len;i++)
        {
            sum=nums[i]+p;
            if(sum<val)
            {

                System.out.println(val+"="+sum);
                System.out.println(i);
                val=sum;
                indx=nums[i];
            }

        }
      return indx;

    }
    public static void main(String[] args) 
    {
        int[] arr={6,3,5,2};
        int val=P1590.findSum(arr, 9);
System.out.println(val);
        
    }
    
}
