package Patterns;
/*
*     1
*    212
*   32123
*  4321234
* 543212345
* */
public class PatternSpaceEqual3 {
    public static void main(String []args){
        int i,j,n=5;
        int x=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                 System.out.print(" ");
            }
            x=i;
            for (j=1;j<=i;j++){
                System.out.print(x);
                x--;
            }
            x=2;
            for (j=1;j<=i-1;j++){
                System.out.print(x);
                x++;
            }


//            x=0;
//            for(j=1;j<=i-1;j++){
//                System.out.print(x);
//                x++;
//            }
            System.out.println();
        }


    }
}
