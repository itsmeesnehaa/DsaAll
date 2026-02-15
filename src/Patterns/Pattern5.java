package Patterns;
/*
* =1
* * *=3
* * * * *=5
* * * * * * *=7
* * * * * * * * *=9
* */

public class Pattern5 {
    public static void main(String []args){
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i+(i-1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
