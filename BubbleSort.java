public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int[] arr={1,2,5,4,3,2};
        
          
            boolean b=true;
            int val=arr[0];
            while(b)
            {
                int j=0;
                for(int i=1;i<arr.length;i++)
                {
                    if(val>arr[i])
                    {
                       int temp=arr[i];
                        arr[i-1]= arr[i];
                        val=temp;
                        j++;
                    }
                    else
                    {
                        val=arr[i];
                    }
                }
                if(j==0)
                {
                    b=false;
                }
            }
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);

            }
        }
        
    }
    

