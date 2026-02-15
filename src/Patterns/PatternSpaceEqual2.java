package Patterns;
/*
* ----1
* ---121
* --12321
* -1234321
* 123454321
*
* */
public class PatternSpaceEqual2 {
    public static void main(String []args){
        int i,j,n=5;
        int x=1;
        for(i=1;i<=5;i++){
            //code for space
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            x=1;
            for(j=1;j<=i;j++){
                System.out.print(x);
                x++;
            }
            x=i-1;
            for(j=1;j<=i-1;j++){
                System.out.print(x);
                x--;
            }
            System.out.println();
        }
    }
}
