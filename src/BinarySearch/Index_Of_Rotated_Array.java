package BinarySearch;

import java.util.Scanner;

public class Index_Of_Rotated_Array {

    public static int binarySearch(double[] arr,int size){
        int start=0;
        int end=size-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[(mid+1)%size]&&arr[mid]<arr[(mid+size-1)%size]){
                return  mid;
            } else if (arr[mid]>arr[size-1]) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int size;
        System.out.println("Enter array size");
        size=sc.nextInt();
        double[] arr=new double[size];
        System.out.println("Enter your element ");
        for (int i=0;i<size;i++){
            System.out.print("Enter element no "+(i+1)+" ");
            arr[i]=sc.nextDouble();
        }

        int c=binarySearch(arr,size);
        if (c==-1){
            System.out.println("Element not found ");
        }else {
            System.out.println(("Index of minimuim in the element="+c));
        }
    }


}
