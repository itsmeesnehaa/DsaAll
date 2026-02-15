package Patterns;
/*
* * -2
* * * * -4
* * * * * * -6
* * * * * * * * -8
* * * * * * * * * * -10
* */
public class Pattern6 {
    public static void main(String []args){
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i+(i);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
