package Patterns;
//import java.io.InputStream;
import java.util.Scanner;
/*

*
* * *
* * * * *
* * * * * * *
* * * * * * * * *
* * * * * * *
* * * * *
* * *
*

*/

public class PatternInverted1 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("The value of n:"+ n);

        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i+(i-1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i)+(n-i+1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
