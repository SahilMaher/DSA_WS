/**
 * Matrix
 */

public class Matrix 
{
    public static void main(String[] args) 
    {
        int[][] arr={
            {1,0,0,1,0,1,0,1,0,0,0,0,1,1,0,0,1,0,1,0,1,0,0,0,0,0,1,0},
            {1,0,0,1,0,1,0,1,0,0,1,0,1,1,0,0,1,0,1,0,1,0,0,0,0,0,0,1},
            {1,0,0,1,0,1,0,1,0,0,0,0,1,1,0,0,1,0,1,0,1,0,0,0,0,0,0,1},
            {1,0,1,1,0,1,0,1,0,0,0,0,1,1,0,0,1,0,1,0,1,0,0,0,0,1,1,1}
    };
int count=0;

    for(int i=0;i<arr[0].length;i++)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j][i]==1)
            {
                count++;
                break;
            }
        }
    }
    System.out.println(count);

        
    }

    
}