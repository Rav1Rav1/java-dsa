package Recursion.String;

public class Print_Subsequences_Without_ArrayList {

    public static void displaySubsequences(String s ,String currentAns){
        if (s.length()==0){
            System.out.println(currentAns);
            return;
        }
        char curr=s.charAt(0);
        String remString=s.substring(1);
        displaySubsequences(remString,currentAns+curr);
        displaySubsequences(remString,currentAns);
    }

    public static void main(String[] args) {
        String s="abc";
        displaySubsequences(s," ");

    }

}
