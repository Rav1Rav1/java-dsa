package Sorting;

public class Seperate_Zero_And_Other_Element_Without_Sorting {

        public static void bubbleSort(int[] arr){

            int n=arr.length;
            for (int i=0;i<n-1;i++){
                boolean check=false;
                for (int j=0;j<n-i-1;j++){
                    if (arr[j]==0&&arr[j+1]!=0){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        check=true;
                    }
                }
                if (!check) return;
            }

        }

        public static void main(String[] args) {

            int[] arr={0,0,3,2,1,0};
            bubbleSort(arr);

            for (int i : arr){
                System.out.print(i+" ");
            }
        }

    }

