package BinarySearch;

import java.util.Scanner;

public class Peak_Element_In_A_Unsorted_Array {

    public static int binarySearch(int[] arr,int size){
        int start=0;
        int end=size-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid>0&&mid<size-1){
                if(arr[mid]>arr[mid+1]&&arr[mid]>mid-1){
                    return mid;
                }
                else if (arr[mid-1]>arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else if(arr[0]>arr[1]){
                return  1;
            } else if (arr[size-1]>arr[size-2]) {
                return size-1;
            }

        }

        return -1;
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


        int c=binarySearch(arr,size);
        if (c==-1){
            System.out.println("Element not found ");
        }else {
            System.out.println(("peak element="+arr[c]));
        }

    }

}
