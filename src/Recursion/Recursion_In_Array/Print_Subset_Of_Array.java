package Recursion.Recursion_In_Array;

public class Print_Subset_Of_Array {

    public static void displaySubset(int[] arr, int size, int index ,int currSubsetSum){

        if (index>=size){
            System.out.println(currSubsetSum);
            return;
        }

//        currSubsetSum+currentIndex
        displaySubset(arr,size,index+1,currSubsetSum+arr[index]);

//        current Answer
        displaySubset(arr,size,index+1,currSubsetSum);
    }

    public static void main(String[] args) {
        int arr[]={2,4,5};
        displaySubset(arr,arr.length,0,0);
    }

}
