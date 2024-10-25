

public class Trees {
    public static void main(String[] args) 
    {
        Node fnode=new Node(1);
        Node snode=new Node(2);
        Node tnode=new Node(3);


        fnode.right=snode;
        fnode.left=tnode;

        
    }
}


/**
 * InnerTrees
 */
 class Node {

    int key;
    Node left,right;
    
    Node(int val)
    {
        key=val;
        left=right=null;
    }

    
}