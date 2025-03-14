package BinarySearch;

import java.util.Scanner;

public class Target_In_Binary_Sorted_Array {

    public static int findElementInAnInfinitrArray(int[] arr,int target){

        int start=0;
        int end=1;
        while(arr[end]!=1){
            start=end;
            end=end*2;
            if(end>arr.length){
                end=arr.length-1;
            }
        }

        return binarySearch(arr,start,end,target);
    }

    public static int binarySearch(int[] arr,int start,int end,int target){

        int result=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                result =mid;
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[]  arr={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1};

        int target=1;
        System.out.println("target element=1");

        int c=findElementInAnInfinitrArray(arr,target);

        if(c==-1){
            System.out.println("Target Element Not Found");
        }else {
            System.out.println("Index of Target Element ="+c);
        }
    }


}
