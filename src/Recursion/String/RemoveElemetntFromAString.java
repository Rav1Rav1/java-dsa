package Recursion.String;

public class RemoveElemetntFromAString {

    public static String removeAnCharacter(String s,int index,char a){
        if (index==s.length()) return " ";
        removeAnCharacter(s,index+1,a);
        String ans =removeAnCharacter(s,index+1,a);
        char currVal=s.charAt(index);
        if (currVal!=a){
             return currVal+ans;
        }else {
            return ans;
        }

    }

    public static String removeAnCharacterWithoutIndex(String s,char a){
        if (s.length()==0) return " ";
        String ans =removeAnCharacterWithoutIndex(s.substring(1),a);
        char currVal=s.charAt(0);
        if (currVal!=a){
            return currVal+ans;
        }else {
            return ans;
        }

    }

    public static void main(String[] args) {
        String s="ravisingh";

        System.out.println(removeAnCharacter(s,0,'i'));
        System.out.println();
        System.out.println(removeAnCharacterWithoutIndex(s,'i'));
    }
    
}
