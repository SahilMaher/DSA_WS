public class Jump 
{
    public boolean canJump(int[] nums) 
    {
       if(nums.length==0) return false;
       if(nums[0]==0 && nums.length>1) return false;
       int jump=0;
       //2,0
       for(int i=0;i<nums.length;i++)
       {
        if(i==0 && nums[i]==0)
        {
            return true;
        }
        if(nums[i]==0)
        {
            return false;
          
        }
        

        // if(i>jump)return false;
        // if(i+nums[i]>jump) jump=i+nums[jump];
       }
       return true;

        
    }
    public static void main(String[] args) 
    {
        int[] nums={3,2,1,0,4};
     
        Jump j=new Jump();
        System.out.println(j.canJump(nums));
    }
    
}
