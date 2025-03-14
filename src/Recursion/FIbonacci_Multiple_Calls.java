package Recursion;

import java.util.Scanner;

public class FIbonacci_Multiple_Calls {

    public static int fibo(int n){
        if (n==0) return -1;
        if (n==1) return 0;
        if (n==2 || n==3) return 1;

        return fibo(n-1)+fibo(n-2);
    }

    public static void printFibonacciSeries(int n){
        for (int i=1;i<=n;i++){
            System.out.print(fibo(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter nth term to find fibonacci : ");
        int n= sc.nextInt();
        printFibonacciSeries(n);
        int answer=fibo(n);
        System.out.println("Answer="+answer);
    }

}
