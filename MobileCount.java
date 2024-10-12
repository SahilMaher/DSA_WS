public class MobileCount 
{
    public static void main(String[] args) 
    {
         long number = 997470333;
        int sum=0;
        while (number > 0) {
            long digit = number % 10; 
           sum+=digit;
            number /= 10; 
        }
        
    System.out.println(sum);
    }

    
}
