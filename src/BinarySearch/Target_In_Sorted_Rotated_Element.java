package BinarySearch;

import java.util.Scanner;

public class Target_In_Sorted_Rotated_Element {

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

    public static int binarySearch(double[] arr,int start, int end,double target){

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

        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter array size");
        size = sc.nextInt();
        double[] arr = new double[size];
        System.out.println("Enter your element ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element no " + (i + 1) + " ");
            arr[i] = sc.nextDouble();
        }

        double target;
        System.out.println("Enter target Element ");
        target=sc.nextDouble();

        int c = binarySearch(arr, size);
        int t1=binarySearch(arr,0,c-1,target);
        int t2=binarySearch(arr,c,size-1,target);

        if (t1==-1&&t2==-1){
            System.out.println("Element Not Found ");
        }else if (t2!=-1) {
            System.out.println("Target Element index="+t2);
        }else {
            System.out.println("Target Element index="+t1);
        }


    }

}
