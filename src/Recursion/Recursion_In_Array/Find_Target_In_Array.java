package Recursion.Recursion_In_Array;

public class Find_Target_In_Array {

    public static void findAllIndexes(int[] arr,int index,int target){
        if (index>arr.length-1){
            return;
        }

        if (arr[index]==target){
            System.out.print(index+"  ");
        }

        findAllIndexes(arr,index+1,target);


        
    }

    public static int findTarget(int[] arr,int index,int target){
        if (index>arr.length-1){
            return -1;
        }
        int smallAnswer=findTarget(arr,index+1,target);

        if (target==arr[index]){
            return index;
        }else {
            return smallAnswer;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,2};
        int ans=findTarget(arr,0,2);
        System.out.println(ans);
        findAllIndexes(arr,0,2);
    }

}
