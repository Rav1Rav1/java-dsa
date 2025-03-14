package Recursion;

public class K_multiple_of_n {

    public static int multipleOf_n(int n,int k){
        if (k==1) return k ;
        multipleOf_n(n,k-1);
        System.out.print(n*k+"  ");
        return k;
    }

    public static void main(String[] args) {

        multipleOf_n(5,5);
    }

}
