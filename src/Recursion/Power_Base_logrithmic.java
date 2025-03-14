package Recursion;

import java.util.Scanner;

public class Power_Base_logrithmic {


    public static int powerlog(int p,int b){
        if (p==0) return 1;

        int a=powerlog(p/2,b);

        if (p%2==0) return a*a;
        else return a*a*b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base : ");
        int b= sc.nextInt();
        System.out.print("Enter power : ");
        int p= sc.nextInt();

        System.out.println( powerlog(p,b));
    }


}
