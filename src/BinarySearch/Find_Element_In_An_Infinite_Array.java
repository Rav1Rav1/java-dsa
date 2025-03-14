package BinarySearch;

import java.util.Scanner;

public class Find_Element_In_An_Infinite_Array {

    public static int findElementInAnInfinitrArray(int[] arr, int target) {

        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            start = end;
            end = end * 2;
        }

        return binarySearch(arr, start, end, target);
    }

    public static int binarySearch(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 5, 6, 8, 12, 15, 20, 26, 29, 38, 48, 100, 150, 221, 440, 500, 1000, 560, 900};

        int target;
        System.out.println("Enter target element");
        target = sc.nextInt();
        int c = findElementInAnInfinitrArray(arr, target);

        if (c == -1) {
            System.out.println("Target Element Not Found");
        } else {
            System.out.println("Index of Target Element =" + c);
        }
    }


}
