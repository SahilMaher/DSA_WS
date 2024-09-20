
public class RecursiveSum {

    public static int superDigit(String n, int k) 
    {
        int nVal=0;
        int sum=0;
        boolean b=true;
        while(b)
        {
            if(n.length()>1)
            {
            for(int i=0;i<n.length();i++)
            {
                String strVal=""+n.charAt(i);
                int val=Integer.parseInt(strVal);
                sum+=val;
                
            }
        }
        else
        {
            sum*=k;
            n=String.valueOf(sum);
            for(int i=0;i<n.length();i++)
            {  
            String strVal=""+n.charAt(i);
            int val=Integer.parseInt(strVal);
            sum+=val;
                
            }
            int c=sum;
            b=false;


        }
            n=String.valueOf(sum);
        }
      
      return nVal;
    

    }
    public static void main(String[] args) 
    {
        System.out.println(RecursiveSum.superDigit("148",3));

        
    }
}