package Stacks.advanceQuetion;

import java.util.Scanner;
import java.util.Stack;

public class BalanceAllVBracket {

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
           else if (ch == ')' || ch == '}' || ch == ']') {
               if (st.isEmpty()) return false;
                char top = st.peek();
                if ((ch == ')' && top == '(') ||( ch == '}' && top == '{') || (ch == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.size() > 0) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();

        System.out.println(isBalanced(str));
    }

}

