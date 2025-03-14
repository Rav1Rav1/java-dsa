package LinledList.Doubly_LinkedList;

public class Target_In_Sum_Of_Two_Nodes {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void findTargetInSumOFTwoNodes(Node head,int target){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node tail=temp;
        temp=head;
        while (head.data<tail.data){
            if (head.data+tail.data==target){
                System.out.println("Starting Index Element ="+head.data+"\nEnding Index Element="+tail.data);
                return;
            }
            if (head.data+tail.data>target) tail=tail.prev;
            else head=head.next;
        }
    }

    public static void main(String[] args) {


        Node a=new Node(5);
        Node b=new Node(9);
        Node c=new Node(17);
        Node d=new Node(20);
        Node e=new Node(24);
        Node f=new Node(30);
        Node g=new Node(38);
        Node h=new Node(40);
        Node i=new Node(41);
        Node j=new Node(50);
        Node k=new Node(59);

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
        g.next=h;
        h.prev=g;
        h.next=i;
        i.prev=h;
        i.next=j;
        j.prev=i;
        j.next=k;
        k.prev=j;

        int target=70;

        findTargetInSumOFTwoNodes(a,70);

    }

}
