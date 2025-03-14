package LinledList.Singly_LinkedList;

public class Reverse_A_Linked_List_Using_Recursion {

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

    public static Node reverseALinkedList(Node head){
        if (head.next==null) return head;
        Node newhead=reverseALinkedList(head.next);
        head.next.next=head;
        head.next=null;

        return newhead;
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(15);
        Node d=new Node(20);
        Node e=new Node(25);
        Node f=new Node(30);
        Node g=new Node(35);
        Node h=new Node(40);
        Node i=new Node(45);
        Node j=new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;

        display(a);

        Node ans=reverseALinkedList(a);

        display(ans);

    }

}
