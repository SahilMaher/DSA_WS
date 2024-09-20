import java.util.*;

public class Oder 
{
    public static void main(String[] args) 
    {
        Map<String,Integer> mp=new HashMap<>();
       
      
        mp.put("A",90);
        mp.put("B",98);
        mp.put("C",96);
        mp.put("G",91);
        mp.put("E",79);
       Collection<Integer> clm=mp.values();
       List<String> lstN=new ArrayList<>(mp.keySet());
       List<Integer> lstM=new ArrayList<>(clm);
       Collections.sort(lstM);
       lstN.sort(Comparator.reverseOrder());
       System.out.println(lstM);
       System.out.println(lstN);
       
       




        
    }
    
}
