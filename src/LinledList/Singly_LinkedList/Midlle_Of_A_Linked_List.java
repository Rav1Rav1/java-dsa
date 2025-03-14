package LinledList.Singly_LinkedList;

public class Midlle_Of_A_Linked_List {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

   public static Node leftmiddleOfANode(Node head){
        Node slow=head;
        Node fast=head;

        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node rightmiddleOfANode(Node head){
        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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
        Node i=new Node(90);
        Node j=new Node(100);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;

        Node ans=leftmiddleOfANode(a);
        System.out.println(ans.data);

        Node ans2=rightmiddleOfANode(a);
        System.out.println(ans2.data);
    }

}
