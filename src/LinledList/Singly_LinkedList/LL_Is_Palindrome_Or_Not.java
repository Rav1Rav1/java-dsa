package LinledList.Singly_LinkedList;

public class LL_Is_Palindrome_Or_Not {


    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public  static void display(Node head){
        while(head!=null){
            System.out.print(head.data+"  ");
            head=head.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head){

        Node currNode=head;
        Node prevNode=null;
        Node nextNode=null;

        while (currNode!=null){
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }

        return prevNode ;
    }

    public static boolean isPalindrome(Node head){

        Node slow=head;
        Node fast=head;

        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }


        Node temp=reverse(slow.next);
        display(temp);
        slow.next=temp;
        Node h1=head;
        Node h2=slow.next;
        while (h2!=null){
            if (h1.data!=h2.data) return false;
            h1=h1.next;
            h2=h2.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(1);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);

        System.out.println(isPalindrome(a));
    }


}
