package Patterns;
/*
*
* *
* * *
* * * *
* * *
* *
*
*/
public class PatternInverted {
    public static void main(String []args){
        int i,j,k,n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
