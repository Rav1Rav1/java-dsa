package BinarySearch;

import java.util.Scanner;

public class BinarySearchInAscending {

    public static int binarySearch(double[] arr,int size,double target){
        int start=0;
        int end=size-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return  mid;
            } else if (target>arr[mid]) {
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

        double target;
        System.out.println("Enter your target element ");
        target=sc.nextDouble();
        int c=binarySearch(arr,size,target);
        if (c==-1){
            System.out.println("Element not found ");
        }else {
            System.out.println(("Index of target element="+c));
        }
    }

}
