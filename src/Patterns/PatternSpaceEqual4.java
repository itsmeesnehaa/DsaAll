package Patterns;
/*
1      1
12    21
123  321
12344321
* */
public class PatternSpaceEqual4 {
    public static void main(String[] args) {
        int i, j, n = 4;
        int x=4;
        for (i = 1; i <= n; i++) {

            x=1;
            for (j = 1; j <= i; j++) {
                System.out.print(x);
                x++;
            }
            //for space
            for(j=1;j<=n-i;j++){
                System.out.print("-");
            }
            //next space
            for(j=1;j<=n-i;j++){
                System.out.print("*");
            }
            x=i;
            for(j=1;j<=i;j++){
                System.out.print(x);
                x--;
            }
            System.out.println(" ");
        }
    }
}