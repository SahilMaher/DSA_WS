public class Selection 
{
    static int select(int[] arr,int i)
    {
        int min=i;
        for(int j=i;j<arr.length;j++)
        {
            if(arr[min]>arr[j])
            {
                min =j;
            }

        }
        return min;
    }
    
    public static void main(String[] args) 
    {
        int[] arr={4 ,1 ,3 ,9 ,7};
        int len=arr.length;
        for(int i=0;i<=len-2;i++)
        {
            int mini=select(arr,i);
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
          
            
        }
        for(int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }


        
    }

    
}