package Recursion;

import java.util.Scanner;

public class MazePath1 {
    public static int maze(int currentRow,int currentColumn,int endRow ,int endColumn){
        int rightWays=0;
        int downWays=0;
        if (currentColumn==endColumn && currentRow==endRow) return 1;
        if (currentColumn==endColumn){
            downWays=maze(currentRow+1,currentColumn,endRow,endColumn);
        }
        if (currentRow==endRow){
            rightWays=maze(currentRow,currentColumn+1,endRow,endColumn);
        }
        if (currentColumn<endColumn && currentRow<endRow){

            rightWays=rightWays=maze(currentRow,currentColumn+1,endRow,endColumn);
            downWays=downWays=maze(currentRow+1,currentColumn,endRow,endColumn);
        }
        int totalWays=rightWays+downWays;
        return totalWays;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total no of column : ");
        int column= sc.nextInt();
        System.out.println("Enter total no of rows : ");
        int rows=sc.nextInt();
       int answer= maze(1,1,rows,column);

        System.out.println(answer);
    }

}
