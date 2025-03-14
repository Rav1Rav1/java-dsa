package Stacks;

import java.util.Stack;

public class DisplayStack {


    public static void displayRecursively(Stack<Integer> s){
        if (s.size()==0) return;
        int x=s.pop();
        displayRecursively(s);
        System.out.print(x+"  ");
        s.push(x);
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);

        displayRecursively(st);

        System.out.println(st);

//        Stack<Integer> rt=new Stack<>();
//        while (st.size()>0){
//            rt.push(st.pop());
//        }
//
//        while (rt.size()>0){
//            int x=rt.pop();
//            System.out.print(x+"  ");
//            st.push(x);
//        }
//        System.out.println();
//
//        int size=st.size();
//        int[] arr=new int[size];
//        for (int i=size-1;i>=0;i--){
//            arr[i]=st.pop();
//        }
//
//        for (int i=0;i<size;i++){
//            System.out.print(arr[i]+"  ");
//            st.push(arr[i]);
//        }


    }

}
