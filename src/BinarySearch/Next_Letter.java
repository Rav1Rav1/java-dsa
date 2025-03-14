package BinarySearch;

import java.util.Scanner;

public class Next_Letter {

    public static int binarySearch(char[] arr,int size,char target){
        int start=0;
        int end=size-1;
        int result=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
                result=mid;
            }
            else {
                start=mid+1;

            }
        }
        return result;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int size;
        System.out.println("Enter array size");
        size=sc.nextInt();
        sc.nextLine();
        char[] arr=new char[size];
        System.out.println("Enter your element ");
        for (int i=0;i<size;i++){
            System.out.print("Enter element no "+(i+1)+" ");
            arr[i]=sc.nextLine().charAt(0);
        }

        char target;
        System.out.println("Enter your target element to find floor");
        target=sc.nextLine().charAt(0);
        int c=binarySearch(arr,size,target);
        if (c==-1){
            System.out.println("Element not found ");
        }else {
            System.out.println((" Ceiling element="+arr[c]));
        }
    }

}
