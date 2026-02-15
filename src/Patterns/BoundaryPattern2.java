package Patterns;
//Boundary pattern + diagonal line from left to right
public class BoundaryPattern2 {
    public static void main(String []args){
        int i,j,n=9;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==1 || i==9 || j==1 || j==9 || i==j){
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
