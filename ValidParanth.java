import java.util.Stack;

public class ValidParanth 
{
    public boolean validtr(String str)
    {
        if(str.length()==0)
        {
            return true;

        }
        Stack<Character> stack=new Stack<>();
        return stVal(str,stack);
    }
    public boolean stVal(String s,Stack<Character> st)
    {
        char currentChar;
        for(int i=0;i<s.length();i++)
        {
            currentChar=s.charAt(i);
            if(currentChar=='[' || currentChar=='{' || currentChar=='(')
            {
                st.push(currentChar);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char charPop=st.pop();
                if((currentChar=='(' && charPop!=')') || (currentChar=='[' && charPop!=']') || (currentChar=='{' && charPop!='}'))

                {
                    return false;

                }
                
            }

        }
        return st.isEmpty();
    }
    public static void main(String[] args) 
    {
        ValidParanth vp=new ValidParanth();
        String s="(){[]";
        System.out.println(vp.validtr(s));
        
    }
    
}
