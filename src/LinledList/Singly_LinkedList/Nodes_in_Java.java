package LinledList.Singly_LinkedList;

public class Nodes_in_Java {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head){
        int count=0;
        while (head!=null){
            System.out.print(head.data+"   ");
            count++;
            head=head.next;
        }
        System.out.println("Length ="+count);
    }


    public static void displayR(Node head){
        if(head==null)return;
        System.out.print(head.data+"   ");
        displayR(head.next);
    }
    public static void main(String[] args) {

        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(14);
        Node d=new Node(6);
        Node e=new Node(2);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

//        System.out.println(a.next);    System.out.println(b);   same output

//        System.out.println(b.data);    System.out.println(a.next.data);    same output


//        printing Data of Linked List Manually
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);


//        printing data via for loop when no of iteration is known
//        Node temp=a;
//        for(int i=0; i<5;i++){
//            System.out.print(temp.data+"  ");
//            temp=temp.next;
//        }


//        Displaying using while loops
//        Node temp=a;
//        while (temp!=null){
//            System.out.print(temp.data+"   ");
//            temp=temp.next;
//        }



//        Displaying using function
        System.out.println();
        display(a);

//        Displaying using recursion
        System.out.println();
        displayR(a);

    }

}
