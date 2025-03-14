package Recursion.Recursion_In_Array;

public class Sum_Of_All_Element_Of_An_Array {

    public static int sumOFArray(int[] arr,int index){
        if (index==arr.length-1){
            return arr[index];
        }

        return arr[index]+sumOFArray(arr,index+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(sumOFArray(arr,0));

    }

}
