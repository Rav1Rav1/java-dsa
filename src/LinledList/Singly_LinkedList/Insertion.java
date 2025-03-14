package LinledList.Singly_LinkedList;

public class Insertion {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;

        void insertAtHead(int val){
            Node temp=new Node(val);
            if (head==null){
                head=temp;
                tail=temp;
            }else {
                temp.next=head;
                head=temp;
            }
            size++;
        }

         void insertAtEnd(int val){
             Node temp=new Node(val);

            if (head==null){
                head=temp;
            }
            else {
              tail.next=temp;
            }
            tail=temp;
            size++;
        }



        void insertAtIndex(int indexn, int val){
             Node t=new Node(val);
             Node temp=head;
             if(indexn==size){
                 insertAtEnd(val);
                 return;
             }
             if (indexn==0){
                 insertAtHead(val);
                 return;
             }
             for(int i=0;i<indexn-1;i++){
                 temp=temp.next;
             }
             t.next=temp.next;
             temp.next=t;
             size++;
        }

        void deleteAtIndex(int index){
             Node t=head;
             for(int i=0;i<index-2;i++){
                 t=t.next;
             }
             t.next=t.next.next;
            System.out.println("Size="+size);
            if (index==size){
                tail=t;
            }
            if (index==0){
//                head=t;
            }
             size--;

            System.out.println(t.data);


        }

        int getElament(int index){
             Node temp =head;
             for(int i=0;i<index;i++){
                 temp=temp.next;
             }
             return  temp.data;
        }

        void display(){
             Node temp=head;
             while(temp!=null){
                 System.out.print(temp.data+"  ");
                 temp=temp.next;
             }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtHead(5);
        ll.display();
        ll.insertAtHead(15);
        ll.insertAtHead(20);
        ll.display();
        ll.insertAtIndex(2,100);
        ll.display();
        ll.insertAtIndex(4,200);
        ll.display();

        System.out.println("Tail="+ll.tail.data);

        System.out.println(ll.getElament(1));

        System.out.println(ll.size);

        ll.display();

        ll.deleteAtIndex(4);

        ll.display();

        System.out.println("Tail="+ll.tail.data);

//        ll.display();


        ll.deleteAtIndex(4);

        ll.display();

        System.out.println("Tail="+ll.tail.data);

    }

}
