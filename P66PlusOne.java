import java.math.BigInteger;
import java.util.*;
public class P66PlusOne 
{
    public static void main(String[] args) {
        int[] digits={1,2,3};
   
        String arr=Arrays.toString(digits);
        String val="";
        for(int i=0;i<arr.length();i++)
        {
            char ch=arr.charAt(i);
            System.out.println(ch);
            if(ch=='[' || ch==']' || ch==',' || ch==' ')
            {
                continue;
            } 
        
            val+=ch;
           }
       BigInteger inc=new BigInteger(val);
       BigInteger q=new BigInteger("1");
           BigInteger inc2=inc.add(q);
      
        String str=String.valueOf(inc2);
           int strLen=str.length();
           int[] finArr=new int[strLen];
           for(int i=0;i<strLen;i++)
           {
            char ch=str.charAt(i);
            String s=""+ch;
            int val1=Integer.parseInt(s);
            finArr[i]=val1;

           }
 
      


    }
    
}
