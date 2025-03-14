//package Stacks;
//
//import java.util.Stack;
//
//public class InsertionInStack {
//
//    public static void pushAtBottomRecursively(Stack<Integer> s,int index, int value){
//
//        if (s.size()==index) return;
//        s.pop();
//        pushAtBottomRecursively(s,index,value);
//        s.push();
//
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer> st=new Stack<>();
//        st.push(5);
//        st.push(10);
//        st.push(15);
//        st.push(20);
//        st.push(25);
//
//        System.out.println(st);
//
//        int index=2;
//        int data=120;
//
//        Stack<Integer> temp=new Stack<>();
//
//        while (st.size()>index){
//            temp.push(st.pop());
//        }
//
//        st.push(data);
//        while (temp.size()>0){
//
//            st.push(temp.pop());
//        }
//
//        System.out.println(st);
//    }
//
//}
