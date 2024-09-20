import java.util.*;
public class StringRev
{
    public static void main(String[] args) {
        String s="a good   example";
        String[] str=s.split("\\s+");
        List<String> lstStr=Arrays.asList(str);
        lstStr.remove(" ");
      
        Collections.reverse(lstStr);

        String newStr="";
        for(int i=0;i<lstStr.size();i++)
        {
            newStr+=" "+lstStr.get(i);

        }

        System.out.println(lstStr);

        System.out.println(newStr.trim());
    }
    
}
