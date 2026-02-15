package Patterns;
/*
    *****
   *****
  *****
 *****

*/

public class PatternSpace4 {
    public static void main(String []args){
        int i,j,n=4;
        for( i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
