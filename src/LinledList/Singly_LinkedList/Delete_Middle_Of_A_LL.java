package LinledList.Singly_LinkedList;

public class Delete_Middle_Of_A_LL {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head){
        while (head!=null){
            System.out.print(head.data+"  ");
            head=head.next;
        }
        System.out.println();
    }

    public static Node deleteMiddleElement(Node head){
        if (head.next==null) return null;

        Node slow=head;
        Node fast=head;

        while (fast.next.next!=null&&fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        Node g=new Node(70);
        Node h=new Node(80);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        display(a);
        deleteMiddleElement(a);
        display(a);
    }

}
