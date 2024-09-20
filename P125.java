public class P125 
{
    public boolean isPalindrome(String s)  {
        int len=s.length();
        String str="";
        s=s.toLowerCase();
        String revStr="";
        for(int  i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch))
            {
                str+=ch;
                revStr=ch+revStr;
            }
        }
        
        System.out.println(str);
        System.out.println(revStr);
        if(str.equals(revStr))
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        P125 p=new P125();
       System.out.println(p.isPalindrome("0P")); 
    }
    
}
