
public class LinkedLst 
{
  
    public static void main(String[] args) 
    {
        LL l=new LL();
        l.addNode(0);
        l.addNode(2);
        l.addNode(3);
                l.addNode(4);
        l.addNode(5);
        l.addNode(6);
        //l.addLast(10);
        //l.insIndex(30,2);

        
        l.display();
        //l.deleteIndex(3);
        //l.display();
        

        
    }
    
}
class LL
{
    private Node head;
    private Node tail;
    private int size;
    LL()
    {
        this.size=0;
    }

    public void deleteFirst()
    {
        head=head.next;

        if(head==null)
        {
            tail=null;
         
        }
        size--;


    }
    public void deleteIndex(int indx)
    {
        if (indx==0) 
        {
            deleteFirst();
            
        }
        if(indx==size-1)
        {
            deleteLast();
        }
        Node temp=head;
        while (temp.next.val!=getValIndx(indx)) 
        {
            temp=temp.next;
            
        }
        Node current=temp;
        Node breake=temp.next;
        current.next=breake.next;
        size--;

        
    }
public void deleteLast()
{
    Node temp=head;
    while(temp.next!=tail)
    {
        temp=temp.next;
    }
    tail=temp;
    tail.next=null;
    size--;



}



  public  void addNode(int val)
    {
        Node nt=new Node(val);
        nt.next=head;
        head=nt;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;
       
    }
    public void insIndex(int val,int indx)
    {
        if(indx==0)
        {
            addNode(val);
            return;
        }
        if(indx==size)
        {
            addLast(val);
            return;
        }
        Node temp=head;

        for(int i=1;i<indx;i++)
        {
            temp=temp.next;

        }
        Node newNode=new Node(val,temp.next);
        temp.next=newNode;
        size++;

    }
    void addLast(int val)
    {
        
        Node node=new Node(val);
        if(tail==null)
        {
            addNode(val);
            return;

        }
        tail.next=node;
        tail=node;
        size++;
    }
    public int getValIndx(int indx)
    {
        Node temp=head;
        if(indx==0)
        {
            return head.val;
        }
        if(indx==size)
        {
            return tail.val;
        }
        for(int i=1;i<indx;i++)
        {
            temp=temp.next;
        }
        
        return temp.val;

    }
    public void display()
    {
        Node temp=head;
        Node t;
        t=head;
        
        t=tail;
        

        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;

 
        }
        System.out.println("End");
        System.out.println("Head"+head.val);
        System.out.println("Tail"+tail.val);
    

    }
    class Node
    {
       private int val;
       private Node next;
       public Node(int val)
        {
            this.val=val;

        }
      public  Node(int val,Node next)
        {
            this.next=next;
            this.val=val;
        }


    }
}