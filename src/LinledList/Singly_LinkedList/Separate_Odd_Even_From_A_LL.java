package LinledList.Singly_LinkedList;

public class Separate_Odd_Even_From_A_LL {

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

    public static Node splitIntoOddEven(Node head){
        Node even=new Node(0);
        Node odd=new Node(0);
        Node tempo=odd;
        Node tempe=even;
        Node temp=head;

        while(temp!=null){
            tempo.next=temp;
            temp=temp.next;
            tempo=tempo.next;

            tempe.next=temp;
            if (temp==null) break;
            temp=temp.next;
            tempe=tempe.next;

        }

        odd=odd.next;
        even=even.next;

//        tempo.next=even;

        display(odd);
        display(even);
        return  odd;
    }

    public static void main(String[] args) {
         Node a=new Node(5);
         Node b=new Node(10);
         Node c=new Node(15);
         Node d=new Node(20);
         Node e=new Node(25);
         Node f=new Node(30);

         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
         e.next=f;

         display(a);

         splitIntoOddEven(a);

    }

}
