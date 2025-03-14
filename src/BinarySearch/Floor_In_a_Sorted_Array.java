package BinarySearch;

import java.util.Scanner;

public class Floor_In_a_Sorted_Array {

    public static int binarySearch(int[] arr,int size,double target){
        int start=0;
        int end=size-1;
        int result=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return  arr[mid];
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                start=mid+1;
                result=arr[mid];
            }
        }
        return result;
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int size;
        System.out.println("Enter array size");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter your element ");
        for (int i=0;i<size;i++){
            System.out.print("Enter element no "+(i+1)+" ");
            arr[i]=sc.nextInt();
        }

        int target;
        System.out.println("Enter your target element to find floor");
        target=sc.nextInt();
        int c=binarySearch(arr,size,target);
        if (c==-1){
            System.out.println("Element not found ");
        }else {
            System.out.println((" Floor element="+c));
        }
    }


}
