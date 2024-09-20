import static java.util.stream.Collectors.joining;

public class RemoveDups
{
    public static void main(String[] args) {
        
    
    int[] arr={0,0,1,1,1,2,2,3,3,4};
    int count=0;
    int j=0;
    int len=arr.length;
    for(int i=0;i<len;i++)
    {
        for(j=0;j<i;j++)
        {
            if(arr[i]==arr[j])
            break;
        }
        if(i==j)
        {
            count++;
         
        }
    }
    System.out.println(count);
    }
    
    
}
