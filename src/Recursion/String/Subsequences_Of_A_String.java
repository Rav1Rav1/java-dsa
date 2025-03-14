package Recursion.String;

import java.util.ArrayList;

public class Subsequences_Of_A_String {

    public static ArrayList<String> returnSubsequences(String s){
        ArrayList<String> ans=new ArrayList<>();

        if (s.length()==00){
            ans.add(" ");
            return ans;
        }

        char curr=s.charAt(0);
        ArrayList<String> smallAnswer=returnSubsequences(s.substring(1));
        for (String ss : smallAnswer){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }

    public static void main(String[] args) {

    }

}
