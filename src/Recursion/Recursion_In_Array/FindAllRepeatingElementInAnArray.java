package Recursion.Recursion_In_Array;

import java.util.ArrayList;

public class FindAllRepeatingElementInAnArray {

    public static ArrayList<Integer> findAllIndices(int[] arr,int size,int target,int index){
        if (index>=size){
            return new ArrayList<>();
        }

        ArrayList<Integer> ans=new ArrayList<>();

        if (arr[index]==target){
            ans.add(index);
        }

        ArrayList<Integer> smallAnswer=findAllIndices(arr,size,target,index+1);
        ans.addAll(smallAnswer);

        return ans;
    }

    public static void main(String[] args) {
        int[] arr={2,5,4,2,6,2,8,7};
        ArrayList<Integer> ans=findAllIndices(arr,arr.length,2,0);
        System.out.println(ans);
    }

}
