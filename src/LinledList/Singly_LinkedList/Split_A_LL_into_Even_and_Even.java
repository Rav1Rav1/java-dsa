package LinledList.Singly_LinkedList;

public class Split_A_LL_into_Even_and_Even {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void splitIntoOddAndEven(Node head){
        Node temp=head;
        Node oddHead=null;
        Node evenHead=null;

        Node evenTail=null;
        Node oddTail=null;


        while (temp!=null){

            if (temp.data%2==1){
                if (oddHead==null){
                    oddHead=oddTail=temp;
                }
                else {
                    oddTail.next=temp;
                    oddTail=oddTail.next;

                }
            }else {
                if (evenHead==null){
                    evenHead=evenTail=temp;
                }else {
                    evenTail.next=temp;
                    evenTail=evenTail.next;
                }
            }
            temp=temp.next;
        }
        if (oddTail != null) oddTail.next = null;
        if (evenTail != null) evenTail.next = null;

        printLinkedList(evenHead);
        printLinkedList(oddHead);

    }

    public static void printLinkedList(Node head){
        while (head!=null){
            System.out.print(head.data+"  ");
            head=head.next;
        }
        System.out.println();
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


        printLinkedList(a);
        splitIntoOddAndEven(a);


    }

}
