package LinledList.Singly_LinkedList;

public class LL_DeepCopy_With_A_Random_Pointer {

    public static class Node{
        int data;
        Node next;
        Node random;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node deepCopy(Node head){

        Node head2=new Node(0);
        Node temp2=head2;
        Node temp1=head;

//        Creating Deep copy
        while (temp1!=null){
            Node t=new Node(temp1.data);
            temp2.next=t;
            temp2=t;
            temp1=temp1.next;
        }

        head2=head2.next;
        temp2=head2;
        temp1=head;

//        Building Alternate Connections

        Node temp=new Node(-1);
        while (temp1!=null){
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;

            temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
        }

        temp2=head2;
        temp1=head;

//        Assigning Random Pointer

        while (temp1!=null&&temp2!=null){
            if (temp1.random==null) temp2.random=null;
            else temp2.random=temp1.random.next;

            temp1=temp1.next.next;
            if (temp1!=null)temp2=temp2.next.next;
        }

        temp2=head2;
        temp1=head;

//        Separating A List

        while (temp1!=null){
            temp1.next=temp2.next;
            temp1=temp1.next;

            if (temp2.next==null) break;
            temp2.next=temp1.next;
            temp2=temp2.next;
        }

        return head2;
    }

    public static void display(Node head){
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

        a.next=b;
        a.random=null;
        b.next=c;
        b.random=a;
        c.next=d;
        c.random=e;
        d.next=e;
        d.random=c;
        e.next=null;
        e.random=a;

        display(a);

       Node ans= deepCopy(a);

       display(ans);
    }

}
