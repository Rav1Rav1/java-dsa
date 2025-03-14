package Stacks;

import java.util.Scanner;

public class Implementation_By_Array {
    Scanner sc=new Scanner(System.in);

    public static class Stack{
        int n=10;
        int[] arr=new int[n];
        int length=0;

        void push(int val){
            if (length==n){
                System.out.println("Stack is OverFlow ! Unavble to push");
                return;
            }
            arr[length]=val;
            length++;
        }

        void pop(){
            if (length==0){
                System.out.println("There is no data to fetch ");
                return;
            }
            System.out.println(arr[length-1]);
            arr[length]=0;
            length--;
        }

        void peek(){
            if (length>0)
            System.out.println(arr[length-1]);
            else System.out.println("there is no data in the stack");
        }

        void display(){
            if (length==0) {
                System.out.println("Empty Stack");
                return;
            }
           for (int i=0;i<length;i++){
               System.out.print(arr[i]+"  ");
           }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Stack s=new Stack();
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      s.push(5);
      s.push(6);
      s.push(7);
      s.push(8);
      s.push(9);
      s.push(10);
      s.display();
      s.push(11);
      s.push(12);
      s.push(13);
      s.push(14);
      s.push(15);
      s.push(16);


    }

}
