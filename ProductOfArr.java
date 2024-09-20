public class ProductOfArr 
{
    public static void main(String[] args) 
    {
        int[] nums={0,0};
        int len=nums.length;
        int[] arr=new  int[len];
        
        
        for(int i=0;i<len;i++)
        {
            int val=nums[i];
            int mul=1;
            for(int ii=0;ii<len;ii++)
            {
                if(ii!=i)
                {
                   mul=mul*nums[ii];
                }
              


            }
            arr[i]=mul;
            System.out.println(mul);
        }

        
    }
    
}
