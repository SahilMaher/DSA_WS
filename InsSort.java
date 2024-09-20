import java.util.*;
public class InsSort 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length");
        int len=sc.nextInt();
        int[] arr=new int[len];
        int inc=0;
        for(int i=0;i<len;i++)
        {
            System.out.println("Enter Value");
            int val=sc.nextInt();
            if(inc==0)
            {
                arr[inc]=val;
                inc++;
            }
            else
            {
                for(int ii=0;ii<inc;ii++)
                {
                    if(arr[ii]<val)
                    {
                        arr[inc]=val;
                        inc++;
                    }
                    else
                    {
                        arr[ii]=val;
                        inc++;

                    }
                }
            }



        }
        for(int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }

        
    }
    
}
