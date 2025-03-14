package LinledList.Singly_LinkedList;

public class Node_Where_Cycle_Begins {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int beginingNodeOfACycle(Node head){
        Node slow=head;
        Node fast=head;

        if (head==null||slow==null||fast==null) return -1;
        if (head.next==null) return -1;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                break;
            }
        }
        Node temp=head;

        if (fast==slow) return slow.data;

        while (slow!=temp){
            slow=slow.next;
            temp=temp.next;

            if (slow==temp){
                return slow.data;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=a;

        int ans=beginingNodeOfACycle(a);
        if (ans==-1){
            System.out.println("The linked list is not in a cycle");
        }else {
            System.out.println("starting of cyclic linked list="+ans);
        }
    }

}
