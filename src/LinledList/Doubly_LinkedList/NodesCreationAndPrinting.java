package LinledList.Doubly_LinkedList;

public class NodesCreationAndPrinting {

    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public  static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void display2(Node tail){
        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void displayWithRandomNode(Node randomNode){
        Node temp=randomNode;
        while (temp.prev!=null){
           temp=temp.prev;
        }
        while (temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head,int val){
        Node t=new Node(val);
        t.next=head;
        head.prev = t;
        head=t;
        return head;
    }

    public static Node insertAtEnd(Node head,int val){
        Node t=new Node(val);
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=t;
        t.prev=temp;

        return head;
    }

    public static Node insertAtIndex(int index ,Node head,int val){
        Node tempHead=head;
        Node t=new Node(val);


       for (int i=0;i<index-2;i++){
           tempHead=tempHead.next;
       }

       t.next=tempHead.next;
       tempHead.next.prev=t;
       tempHead.next=t;
       t.prev=tempHead;

        return head;
    }



    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(15);
        Node d=new Node(20);
        Node e=new Node(25);
        Node f=new Node(30);
        Node g=new Node(35);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=g;
        g.prev=f;


//        display(a);
//        display2(g);

        displayWithRandomNode(c);

        Node inAtHead=insertAtHead(a,50);

        displayWithRandomNode(inAtHead);

        Node intAtEnd=insertAtEnd(a,100);

        displayWithRandomNode(intAtEnd);


        Node insAtIndex=insertAtIndex(4,a,200);

        displayWithRandomNode(a);
    }

}
