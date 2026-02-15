package Patterns;
/*
111111111
122222221
123333321
123444321
123454321
123444321
123333321
122222221
111111111
* */
public class RectanglePattern {
    public static void main(String []args){
        int i,j,n=5;
        int x=1;
        for(i=1;i<=n;i++) {
            x = 1;
            for (j = 1; j <= i; j++) {
                System.out.print(x);
                x++;
            }
            x = i;
            for (j = 1; j <= (n - i) + (n - i); j++) {
                System.out.print(x);
            }
            x = i - 1;
            for (j = 1; j <= i - 1; j++) {
                System.out.print(x);
                x--;
            }
            System.out.println();
        }
        n=4;
        for(i=1;i<=n;i++){
                x=1;
                for(j=1;j<=n-i;j++){
                    System.out.print(x);
                    x++;
                }
                x=n-i+1;
                for(j=1;j<=i+i+1;j++){
                    System.out.print(x);
                }
                x=n-i;
                for(j=1;j<=n-i;j++){
                    System.out.print(x);
                    x--;
                }
                System.out.println(" ");
        }
    }
}

