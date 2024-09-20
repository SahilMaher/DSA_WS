public class MergeArr 
{
    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int m=3;
        int[] arr2={2,5,6}; 
        int n=3;
        int[] arr=new int[m+n];
        int j=0;
        int i2=0;
        for(int i=0;i<m+n;i++)
        {
            if(j<m)
            {
                arr[j++]=arr1[i];
            }
            else
            {
              
                arr[j++]=arr2[i2];
                i2++;
            }
            
        }
        // for(int i=0;i<n;i++)
        // {
        //     arr[j++]=arr2[i];

        // }
        for(int i=0;i<arr.length;i++)
        {
            System.err.println(arr[i]);
        }

    }
    
}
