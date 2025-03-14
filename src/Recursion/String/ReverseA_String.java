package Recursion.String;

public class ReverseA_String {



    public static String reverseAStringWithoutIndex(String s){
        if (s.length()==0) return "";
        String smallAnswer=reverseAStringWithoutIndex(s.substring(1));
        char currentAnswer=s.charAt(0);
        return smallAnswer+currentAnswer;
    }

    public static String reverseAString(String s,int index){
        if (index==s.length()) return "";
        String smallAnswer=reverseAString(s,index+1);
        char currentAnswer=s.charAt(index);
        return smallAnswer+currentAnswer;
    }

    public static void main(String[] args) {
        String s="ravisingh";

        System.out.println(reverseAString(s,0));
        System.out.println(reverseAStringWithoutIndex(s));

    }

}
