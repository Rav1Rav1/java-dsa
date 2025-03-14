package LinledList.Singly_LinkedList;

public class Intersection_Of_Two_Pointers {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head1=null;
        Node head2=null;
        Node tail=null;


        void display(Node head){
            while (head!=null){
                System.out.print(head.data+"   ");
                head=head.next;
            }
            System.out.println();
        }

        int countSize(Node head){
            int size=0;

            while (head!=null){
                size++;
                head=head.next;
            }
        return size;
        }

        Node intersectinOfTwoPointer(Node h1,Node h2,int size1, int size2){
            Node t1=h1;
            Node t2=h2;

            int sizeDiff=size1-size2;
            if (sizeDiff<0){
                sizeDiff=size2-size1;
            }
            for (int i=1;i<=sizeDiff;i++){

                if (size1>size2){
                    t1=t1.next;
                }
                else {
                    t2=t2.next;
                }
            }

            while (t1!=null){
                if (t1.data==t2.data){
                    return t1;
                }
                t1=t1.next;
                t2=t2.next;
            }
            return  null;
        }

    }



    public static void main(String[] args) {

        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        Node g=new Node(70);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;



        Node p=new Node(5);
        Node q=new Node(15);
        Node r=new Node(35);
        Node s = e;

        p.next=q;
        q.next=r;
        r.next=s;

        linkedlist ll=new linkedlist();

        ll.display(a);
        ll.display(p);

        int size1= ll.countSize(a);
        int size2= ll.countSize(p);

        System.out.println("Size1="+size1);
        System.out.println("Size2="+size2);

        Node ans=ll.intersectinOfTwoPointer(a,p,size1,size2);
        System.out.println("Answer ="+ans.data);

    }

}
