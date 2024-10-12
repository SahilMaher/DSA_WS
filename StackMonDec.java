import java.util.Stack;

public class StackMonDec 
{

    public static void StackMonoInc(int[] arr)
    {
        
        Stack<Integer> stack=new Stack<>();
        for(int val : arr)
        {
            
            while(!stack.empty() && val<=stack.peek())
            {
                stack.pop();
            }
            stack.push(val);
        }
        System.out.println(stack);

    }
    public static void StackMonoDec(int[] arr)
    {
       
        Stack<Integer> stack=new Stack<>();
        for(int val : arr)
        {
            
            while(!stack.empty() && val>=stack.peek())
            {
                stack.pop();
            }
            stack.push(val);
        }
        System.out.println(stack);

    }
    public static void main(String[] args) 
    {

        int[] arr={1,7,9,5,8};
        StackMonDec.StackMonoInc(arr);
        StackMonDec.StackMonoDec(arr);
        
    }
    
}
