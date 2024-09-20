// WAP function to create matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * 2DVector
 */
 class P2DVector {

    public static void main(String[] args)
    {
       ArrayList<ArrayList<Integer>> vc = new ArrayList<>();
        int inc=1;
        int m=4;
        int n=5;
        for(int i=0;i<m;i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                temp.add(inc++);
               

            }
            vc.add(temp);
        }

     
 
      
    }
}