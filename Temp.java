import java.util.*;
public class Temp 
{
    public static void main(String[] args) 
    {



         Integer[] arr={3,7,4,5,50,50,50,12,-4,18,45,45,45};
      List<Integer> lst=Arrays.asList(arr);
         int max=0;
         max=Collections.max(lst);
         System.out.println(max);
      
         System.out.println(lst.contains(max));

        
    

    //   List<Integer> lst= Arrays.asList(arr);
    //     int k=3;
    //     Collections.sort(lst);
    //     int maxLen=lst.size();
    //     for(int i=m)



    //     int k=3;
    //     int maxSum=0;
    //     Arrays.sort(arr);
    //     int indx=0;
    //     int i=0;
    //     int[] arr2=new int[k];
    //     int maxLen=arr.length-1;
    //    while(i<k)
    //    {
         
    //         maxSum+=arr[maxLen];
    //         arr2[i]=arr[maxLen];
         
    //      maxLen--;
    //      i++;
    //    }
    //    System.out.println(lst);
            // for(int j=0;j<arr2.length;j++)
            // {
            //     int finVal=arr2[j];
            //     for(int jj=0;jj<lst.size();jj++)
            //     {
            //         if(finVal==lst.get(jj))
            //         {
            //             System.out.println(jj);
            //         }

            //     }

            // }

        
        // System.out.println(maxSum);


      
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         int sum=0;
    //         for(int j=i;j<i+k;j++)
    //         {
    //             if(j>arr.length || j==arr.length)
    //             {
    //                 continue;
    //             }
    //             else
    //             {sum+=arr[j];}
               
    //         }
    //         if(sum>maxSum)
    //         {
    //             maxSum=sum;
    //             indx=i;
    //         }
         
    
    //     }
    //     System.out.println(maxSum);
    //    for(int i=indx;i<k+indx;i++)
    //    {
    //     System.out.print(i+" ");
    //    }
   
       
    }
    
}
