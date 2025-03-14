package LinledList.Singly_LinkedList;

public class Nth_Node_From_Last {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node nthNodeFromLast(Node head,int n){
        Node temp=head;
        int size=0;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        int index=size-n+1;
        temp=head;
        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        return  temp;
    }

    public static Node nthNodeFromLastInOneTraversal(Node head,int n){
        Node fast=head;
        Node slow=head;
        for (int i=0;i<n;i++){
            fast=fast.next;
        }

        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return  slow;
    }

    public static void main(String[] args) {

       Node a=new Node(10);
       Node b=new Node(15);
       Node c=new Node(20);
       Node d=new Node(25);
       Node e=new Node(30);
       Node f=new Node(35);
       Node g=new Node(40);

       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       e.next=f;
       f.next=g;

       Node ans=nthNodeFromLast(a,3);
        System.out.println(ans.data);
        Node ans1=nthNodeFromLastInOneTraversal(a,3);
        System.out.println(ans1.data);

    }

}
