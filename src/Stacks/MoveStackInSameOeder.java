package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MoveStackInSameOeder {



    public static void main(String[] args) {

//    Declaration

        Stack<Integer> st=new Stack<>();
        Scanner  sc=new Scanner(System.in);

        int n;
        System.out.println("Enter the no Of Elements");
        n=sc.nextInt();

        for(int i=0;i<n;i++){
            int x= sc.nextInt();

            st.push(x);

        }
        System.out.println(st);

//        reversing Stack
        Stack<Integer> revSt=new Stack<>();
        while (st.size()>0){
            revSt.push( st.pop());
        }
        System.out.println(revSt);


        Stack<Integer> sameStack=new Stack<>();
        while (revSt.size()>0){
            sameStack.push(revSt.pop());
        }
        System.out.println(sameStack);

    }
}
