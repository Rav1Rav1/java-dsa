package Stacks.advanceQuetion;

import java.util.Stack;

public class StackSpan {

    public static int[] stackStamp(int[] arr){
        Stack<Integer> st=new Stack<>();

        int n=arr.length;
        int[] res=new int[n];

        res[0]=1;
        st.push(0);

        for (int i=1;i<n;i++){

            while (st.size()>0&&arr[st.peek()]<=arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                res[i]=(i+1);
            }else {
               res[i]= (i-st.peek());
            }

            st.push(i);

        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};

        int[] ans=stackStamp(arr);

        for (int i : ans){
            System.out.print(i+"  ");
        }
    }

}
