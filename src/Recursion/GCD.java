package Recursion;

public class GCD {

    public static int gcdByLoop(int x,int y){
        while (y%x!=0)
        {
            int rem=y%x;
            y=x;
            x=rem;
        }

        return x;
    }

    public static int gcdByRecursion(int x,int y){
        if (y==0) return x;
        return gcdByRecursion(y,x%y);
    }

    public static void main(String[] args) {
//        System.out.println(gcdByLoop(15,24));
//        System.out.println(gcdByLoop(15,90));
        System.out.println(gcdByLoop(8,24));
        System.out.println(gcdByRecursion(8,24));
    }

}
