package Recursion;

import java.util.Scanner;

public class StairPathCount {

//    In this question only one step and two step is allowed

    public static int stair(int n){
        if (n<=2) return n;

        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter nth stair : ");
        int n= sc.nextInt();
        int answer=stair(n);
        System.out.println("Answer="+answer);
    }

}
