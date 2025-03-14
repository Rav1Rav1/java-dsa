package BinarySearch;

import java.util.Scanner;

public class Target_In_Biotonic_Array {

    public static int peakbinarySearch(int[] arr,int size){
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

    public static int ascendingbinarySearch(int[] arr,int start, int end,int target,int peak){

        if(target==arr[peak]){
            return peak;
        }

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


    public static int descendingbinarySearch(int[] arr,int start,int end,int target,int peak){

        if(target==arr[peak]){
            return peak;
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (target>arr[mid]) {
                end=mid-1;
            }else {
                start=mid+1;
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

        int target;
        System.out.println("Enter target Element ");
        target=sc.nextInt();


        int c=peakbinarySearch(arr,size);
        System.out.println(c);

        int t1=ascendingbinarySearch(arr,0,c-1,target,c);
        int t2=descendingbinarySearch(arr,c+1,size-1,target,c);

        if (t1==-1&&t2==-1){
            System.out.println("Element Not Found ");
        }else if (t2!=-1&&t1!=-1&&t1==c) {
            System.out.println("Target Element Found At  Position "+c);

        } else if (t2!=-1&&t1!=-1) {
            System.out.println("Target Element Found At Two Position ");
            System.out.println("First ="+t1);
            System.out.println("Second ="+t2);
        } else if (t2!=-1) {
            System.out.println("Target Element index="+t2);
        }else {
            System.out.println("Target Element index="+t1);
        }

    }

}
