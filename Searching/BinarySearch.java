public class BinarySearch
{
public static void main(String[] args) 
{
    int[] arr={1,2,3,4,5};
    int len=arr.length;
    int Start=0;
    int val=2;
    boolean b=true;
    while(b)
    {
       int  indx=(Start+len)/2;
       if(arr[indx]==val)
       {
        System.out.println(indx);
        break;
       }
       if(arr[indx]<val)
       {
        Start=indx;
       }
       else
       {
        len=indx;
       }

    }
    
}
}