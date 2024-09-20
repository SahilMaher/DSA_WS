/**
 * GenarateParanthases
 */
public class GenarateParanthases {

    public static void main(String[] args) 
    {
        int n=3;
        for(int i=0;i<n;i++)
        {
            for(int ii=i;ii<n;ii++)
            {
                System.out.print("(");
            }
         
            for(int iii=i;iii<n;iii++)
            {
                System.out.print(")");
                
            }
            for(int iiiii=0;iiiii<i;iiiii++)
            {
                System.out.print("()");
            }
            System.out.println();
        }"((()))","(()())","(())()","()(())","()()()"
      
        
    }
}