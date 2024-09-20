/**
 * MergeVector
 */
 import java.util.*;
public class MergeVector 
{
    public static Vector<Integer> getVec(Vector<Integer> vc1,Vector<Integer> vc2)
    {
        int len =vc1.size()+vc2.size();
        Vector<Integer> vlc=new Vector<>();
        for(int i=0;i<len;i++)
        {
            

        }

    }

    public static void main(String[] args) 
    {
        Vector<Integer> vc=new Vector<>();
        vc.add(1);
        vc.add(3);
        vc.add(2);
        vc.add(6);
        vc.add(4);
        Vector<Integer> vc2=new Vector<>();
        vc2.add(1);
        vc2.add(3);
        vc2.add(2);
        vc2.add(6);
        vc2.add(4);

        Vector vcGet=MergeVector.getVec(vc,vc2);



               
        
    }
}