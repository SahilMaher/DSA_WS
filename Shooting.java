import java.util.ArrayList;
import java.util.List;

public class Shooting {
    public static void main(String[] args) {
        int n = 10; 
        List<Integer> arr = new ArrayList<>();
        
        
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }

        
        while (arr.size() !=1) {
           int count=0;
           int temp=0;
            for (int i = 1; i < arr.size(); i++) {
               if(temp==arr.get(i))
               {
                arr.remove(i);
               }
                if (i % 2 != 0) 
                {
                    if(i==arr.get(arr.size()-1))
                    {
                        temp=arr.get(1);
                    }
                    System.out.println("Removing: " + arr.get(i));
                    arr.add(count,i);
                    count++;
                }
            }
            
          
        }
        
        // Print the last remaining element
        System.out.println(arr);
    }
}
