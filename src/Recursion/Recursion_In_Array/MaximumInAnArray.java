package Recursion.Recursion_In_Array;

public class MaximumInAnArray {

    public static int maximumInAnArry(int[] arr,int size){
        if (size==0) return arr[0];
        int smallProblem=maximumInAnArry(arr,size-1);
        if (smallProblem>arr[size]){
            return smallProblem;
        }else {
            return arr[size];
        }

    }

    public static void main(String[] args) {
        int[] arr={5,10,15,2,6,9};
        System.out.println( maximumInAnArry(arr,arr.length-1));

    }

}
