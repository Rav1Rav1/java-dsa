package BinarySearch;

import java.util.Scanner;

public class Minimum_Difference {

    public static double binarySearch(double[] arr,int size,double target){
        int start=0;
        int end=size-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return  arr[mid];
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        if((Math.abs(arr[start]-target))>Math.abs(arr[end]-target)){
            return arr[end];
        }
        else {
            return arr[start];
        }
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
        double c=binarySearch(arr,size,target);
        if (c==-1){

        }else {
            System.out.println(("Minimum Difference is with="+c));
        }
    }

}
