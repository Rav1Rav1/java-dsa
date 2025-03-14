package LinledList.Doubly_LinkedList;

public class Palindrome {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void displayFromHead(Node head){
        while (head!=null){
            System.out.print(head.data+"  ");
            head=head.next;
        }
        System.out.println();
    }

    public static void displayFromTail(Node tail){
        while (tail!=null){
            System.out.print(tail.data+"  ");
            tail=tail.prev;
        }
        System.out.println();
    }

    public static boolean checkPalindromeUsingHeadOnly(Node head){

        Node temp=head;

        while (temp.next!=null){
            temp=temp.next;
        }

        Node tail=temp;

        temp=head;

        while (temp!=tail){
            if (head.data!=tail.data) return false;
            temp=temp.next;
            tail=tail.prev;
        }
        return  true;
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(5);
        Node h=new Node(4);
        Node i=new Node(3);
        Node j=new Node(2);
        Node k=new Node(1);

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


        displayFromHead(a);
        displayFromTail(k);

//        checkPalindromeUsingHeadOnly(a);
        System.out.println(checkPalindromeUsingHeadOnly(a));

    }
}
