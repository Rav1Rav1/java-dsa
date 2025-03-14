package Recursion.Recursion_In_Array;

public class Print_an_Array {

    public static void printArrayRecursively(int[] arr,int size ){
        if (size==-1) return;
        printArrayRecursively(arr,size-1);
        System.out.print(arr[size]+"  ");
    }

    public static void printArrayRecursively2(int[] arr,int index ){
        if (index==arr.length) return;
        System.out.print(arr[index]+"  ");
        printArrayRecursively2(arr,index+1);

    }


    public static void main(String[] args) {

        int[] arr={5,8,6,10,6,15};
        int size=arr.length;

        printArrayRecursively(arr,size-1);
        System.out.println();
        printArrayRecursively2(arr,0);

    }

}
