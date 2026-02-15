package Patterns;
/*
* 10
* 8
* 6
* 4
* 2
* */
public class Pattern9 {
    public static void main(String []args){
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i)+(n-i)+2;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
