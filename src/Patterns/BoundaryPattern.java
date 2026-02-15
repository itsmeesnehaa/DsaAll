package Patterns;

public class BoundaryPattern {
    public static void main(String []args){
        int i,j,n=9;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==1 || i==9 || j==1 || j==9){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
