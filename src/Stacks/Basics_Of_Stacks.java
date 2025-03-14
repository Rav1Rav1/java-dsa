package Stacks;

import java.util.Stack;

public class Basics_Of_Stacks {

public static void main(String[] args) {

//    Declaration

    Stack<Integer> st=new Stack<>();
    st.push(5);
    st.push(10);
    st.push(15);
    st.push(20);
    st.push(25);

    System.out.println(st);
    System.out.println(st.peek());
    System.out.println(st);

    System.out.println(st.size());
    System.out.println(st);
    st.pop();

    System.out.println(st);
    System.out.println( st.size());

    st.pop();
    System.out.println(st);
    System.out.println( st.size());
    System.out.println(st);

}

}
