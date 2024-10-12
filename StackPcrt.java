import java.util.LinkedList;

public class StackPcrt 
{
    public static void main(String[] args) 
    {
        // InnerStackPcrt isp=new InnerStackPcrt();
        // isp.addNode(1);
        // isp.addNode(2);
        // isp.addNode(3);
        // isp.addNode(4);
        // isp.addLast(7);
        // isp.insIndx(22,2);
        // isp.printData();
        DLL dl=new DLL();
        dl.addFirst(0);
        dl.addFirst(1);
        dl.addFirst(2);
        dl.display();
          

    }
    
}
/**
 * InnerStackPcrt
 */
 class InnerStackPcrt
 {
    private Node head;
    private Node tail;
    private int size;
    InnerStackPcrt()
    {
        this.size=0;
    }
    class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;


        }
        Node(int val,Node next)
        {
            this.val=val;
            this.next=next;

        }
    }
    public void addNode(int val)
    {
        Node nd=new Node(val);
        nd.next=head;
        head=nd;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;


    }
    public void insIndx(int vals,int indx)
    {
        
        Node temp=head;
        int count=0;
        while(count!=indx)
        {
            temp=temp.next;
            count++;
           
        }
    Node nd=new Node(vals,temp.next);
    temp.next=nd;
    size++;
    System.out.println(size);
        
     

    }
    public void addLast(int val)
    {
        Node nd=new Node(val);
        tail.next=nd;
        nd=tail;
        size+=1;
    }
    public void printData()
    {
       Node temp=head;
       while(temp!=null)
       {
        System.out.print(temp.val+"->");
        temp=temp.next;
       }
       System.out.println("end");

    }
    
}
class DLL
{
    private Node head;
        
       
    class Node
    {
        private int val;
        private Node next;
        private Node prev;
        
        Node(int val)
        {
            this.val=val;


        }
        Node(int val,Node next)
        {
            this.val=val;
            this.next=next;


        }

    }
    public void addFirst(int val)
    {
        Node nd=new Node(val);
        nd.next=head;
        nd.prev=null;
        if(head!=null)
        {
            head.prev=nd;
        }
    head=nd;
    }
    public void display()
    {
        Node temp=head;
        Node tmp=null;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            tmp=temp;
            temp=temp.next;
        }
        System.out.println("end");
        
        while(tmp!=null)
        {
            System.out.print(tmp.val+"->");
            tmp=tmp.prev;

        }
        System.out.println("ebd");
    }
}

