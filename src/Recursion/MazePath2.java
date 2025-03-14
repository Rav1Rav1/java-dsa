package Recursion;

import java.util.Scanner;

public class MazePath2 {

    public static int maze(int row,int column){
        int rightWays=0;
        int downWays=0;
        if (row==1&&column==1){
            return 1;
        }
        if (row==1){
           rightWays= maze(row,column-1);
        }
        if (column==1){
            downWays=maze(row-1,column);
        }
        if (row>1&&column>1){
            rightWays= maze(row,column-1);
            downWays=maze(row-1,column);
        }
        int toatlWays=rightWays+downWays;
        return toatlWays;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total no of column : ");
        int column= sc.nextInt();
        System.out.println("Enter total no of rows : ");
        int rows=sc.nextInt();
        int answer= maze(rows,column);

        System.out.println(answer);
    }

}
