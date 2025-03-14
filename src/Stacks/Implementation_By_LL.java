package Stacks;

public class Implementation_By_LL {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class Stack{
        int size=0;
        Node head;

        void push(int val){
            Node newNode=new Node(val);
            if (head==null){
                head=newNode;
            }
            else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        void pop(){
            if (head==null){
                System.out.println("Empty Stack ");
                return;
            }
            System.out.println("Poped data"+head.data);
            head=head.next;
            size--;
        }

        void displayRecursively(Node head){
            Node temp=head;
            if (temp.next==null){
                return;
            }

            displayRecursively(head.next);
            System.out.print(head.data+"  ");

        }

        void display(){
            if (head==null){
                System.out.println("empty stack ");
                return;
            }

//            Node temp=head;
//            while (temp!=null){
//                System.out.print(temp.data+"  ");
//                temp=temp.next;
//            }
            displayRecursively(head);
            System.out.println();
        }


    }

    public static void main(String[] args) {

        Stack s=new Stack();
        s.pop();



    }

}
