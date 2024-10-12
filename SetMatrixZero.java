public class SetMatrixZero 
{
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2,3},{2,0,1},{1,2,3}};
        int len=arr.length;
        int[] row=new int[len];
        int[] col=new int[len];
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(arr[i][j]==0)
                {
                 row[i]=1;
                 col[j]=1;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(row[i]==1 || col[j]==1)
                {
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
               
                    System.out.print( arr[i][j]);
                
            }
            System.out.println();
        }
    }
    
}
