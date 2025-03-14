package LinledList.Singly_LinkedList;

public class Delete_Nth_Node_From_Last {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

//    public static Nth_Node_From_Last.Node nthNodeFromLast(Nth_Node_From_Last.Node head, int n){
//        Nth_Node_From_Last.Node temp=head;
//        int size=0;
//        while (temp!=null){
//            size++;
//            temp=temp.next;
//        }
//        int index=size-n+1;
//        temp=head;
//        for (int i=1;i<index;i++){
//            temp=temp.next;
//        }
//        return  temp;
//    }

    public static Node removeNthNodeFromLast(Node head, int n){
        Node fast=head;
        Node slow=head;
        for (int i=0;i<=n;i++){
            fast=fast.next;
        }

        if (fast==null){
            head=head.next;
            return head;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return  slow;
    }

    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
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

        display(a);
        Node ans=removeNthNodeFromLast(a,6);
        display(ans);
    }

}
