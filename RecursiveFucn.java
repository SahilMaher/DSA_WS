public class RecursiveFucn 
{
    int a=0;
   
    void  Recurs(int n)
    {
       
       
      if(a==6)
      {
        System.out.println(a);
      }
      else
      {     a++;
        System.out.print(a+"*");
        Recurs(n);
    }
        
       
      
            
        
   
      }
      
            


            void decrm(int n)
            {
                if(n>0)
                {
                    System.out.print("*"+n);
                    decrm(--n);
                }

                

            }
    public static void main(String[] args) 
    {
       int val=6;
       RecursiveFucn rs=new RecursiveFucn();
       System.out.print(val);
       rs.decrm(--val);
       rs.Recurs(val);
      
        
      
        
    }
    
}
