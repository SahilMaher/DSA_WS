import java.util.*;

public class ModP 
{
    public static void main(String[] args) 
    {
        Integer[] arr={1,2,3,2,1,4,4,1,4,2,5,5,5,5,4};
        List<Integer> arrVal=Arrays.asList(arr);
        Set<Integer> st=new HashSet<>();
        Collections.addAll(st,arr);
        List<Integer> lst=new ArrayList<>(st);
        List<Integer> freqList=new ArrayList<>();
        Map<Integer,Integer> lstMap=new HashMap<>();
        for(int i=0;i<lst.size();i++)
        {
            int freq=Collections.frequency(arrVal, lst.get(i));
          
            lstMap.put(lst.get(i), freq);
           freqList.add(freq);
        }
       
         int maxFreq=Collections.max(freqList);
       
        List<Integer> indxList=new ArrayList<>();
        for(int i=0;i<lst.size();i++)
        {
            int val=lst.get(i);
            if(maxFreq==lstMap.get(val))
            {
                indxList.add(i);
                
            }
        }
       
        for(int i=0;i<indxList.size();i++)
        {
            int val=indxList.get(i);
            System.out.println(lst.get(val));
        }
        

        

    }
    
}
