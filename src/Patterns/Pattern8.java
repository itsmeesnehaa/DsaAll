package Patterns;
/*
* * * * * * * -7
* * * * * -5
* * * -3
*  -1
*/
public class Pattern8 {
    public static void main(String []args){
        int i,j,n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i)+(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
