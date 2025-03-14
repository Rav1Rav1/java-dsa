package Stacks.advanceQuetion;

import java.util.Scanner;
import java.util.Stack;

public class MIn_no_of_br_to_be_removed {

    public static int bracketToBeRemoved(String str){
        Stack<Character> st=new Stack<>();
        int count=0;
        int n=str.length();
        for (int i=0;i<n;i++){
            char ch=str.charAt(i);
            if (ch=='('){
                st.push('(');
            }
            if (ch==')'){
                if (st.size()==0){
                    count++;
                }
                else {
                    st.pop();
                }
            }
        }
        if (st.size()>0) {
            while (st.size()!=0){
                st.pop();
                count++;
            }
        }
        return st.size()+count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.nextLine();

        int ans=bracketToBeRemoved(str);

        if (ans==0) System.out.println("bracket is already balanced ");
        else System.out.println("No of bracket to be removed to make this balance="+ans);
    }

}
