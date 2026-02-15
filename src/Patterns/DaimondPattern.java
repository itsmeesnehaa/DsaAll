package Patterns;
import java.util.*;
/*
----*
---***
--*****
-*******
*********
-*******
--*****
---***
----*
*/
public class DaimondPattern {
    public static void main(String []args){
        int i,j,k,n=5;
        //printing space then stars
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("-");
            }
            for(j=1;j<=i+(i-1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("-");
            }
            for(j=1;j<=(n-i)+(n-i+1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
