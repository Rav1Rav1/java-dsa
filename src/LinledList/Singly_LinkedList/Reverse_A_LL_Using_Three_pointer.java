package LinledList.Singly_LinkedList;

public class Reverse_A_LL_Using_Three_pointer {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    public  static  void display(Node head){
        while (head!=null){
            System.out.print(head.data+"  ");
            head=head.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head){
        Node prevNode=null;
        Node nextNode=null;
        Node currNode=head;

        while (currNode!=null){
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }

        return  prevNode;
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


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;

        display(a);


        Node ans=reverse(a);

        display(ans);

    }

}
