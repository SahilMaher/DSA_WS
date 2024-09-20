public class ReplaceElemntWithGretest 
{
    public static void main(String[] args) 
    {
        int[] arr={17,18,5,4,6,1};
        int len=arr.length-1;
        
        boolean a=true;
       while(a)
       {
        int b=0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]<arr[i+1])
            {
                b++;
                arr[i]=arr[i+1];
            }

           System.out.print(arr[i]);



        }
        System.out.println();
        if(b==0)
        {
            a=false;
        }
    }
    
    }
    
}
