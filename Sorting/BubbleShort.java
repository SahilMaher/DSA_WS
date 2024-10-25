public class BubbleShort 
{
    public static void bShort(int[] arr,int i1,int i2)
    {
        if(arr[i1]>arr[i2])
        {
            int temp=arr[i1];
            arr[i1]=arr[i2];
            arr[i2]=temp;

        }

    }
    public static void main(String[] args) 
    {

        int[] arr={41,9,9,48,11,2,11,12,28,10,15,4,16,48};
        for(int i=0;i<arr.length-1;i++)
        {
            bShort(arr,i,i+1);


        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
    
}
