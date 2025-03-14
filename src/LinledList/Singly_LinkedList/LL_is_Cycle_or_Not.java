package LinledList.Singly_LinkedList;

public class LL_is_Cycle_or_Not {

    public static class Node{
        int data ;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static boolean cyleOrNot(Node head){
        Node slow=head;
        Node fast=head;

        if (head==null||slow==null||fast==null) return false;
        if (head.next==null){
            return false;
        }
        while (fast!=null){
            slow=slow.next;
            fast= fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+"  ");
            head=head.next;
        }
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
        f.next=c;

        System.out.println(cyleOrNot(a));

    }

}
