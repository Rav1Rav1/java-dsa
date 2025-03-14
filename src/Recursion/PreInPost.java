package Recursion;

import java.util.Scanner;

public class PreInPost {

    public static void preInPost(int n){
        if (n==0) return;
        System.out.println("Pre= "+n);
        preInPost(n-1);
        System.out.println("In= "+n);
        preInPost(n-1);
        System.out.println("Post= "+n);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n=sc.nextInt();
        preInPost(n);
    }

}
