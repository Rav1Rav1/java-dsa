package Recursion;

import java.util.Scanner;

public class StairPathCount2 {

    //    In this question only one step , two step and three steps is allowed

    public static int stair(int n){
        if (n == 0) return 1; // One way: stay at step 0
        if (n < 0) return 0;  // No way to go below step 0

        return stair(n - 1) + stair(n - 2) + stair(n - 3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth stair : ");
        int n = sc.nextInt();
        int answer = stair(n);
        System.out.println("Answer=" + answer);
    }}
