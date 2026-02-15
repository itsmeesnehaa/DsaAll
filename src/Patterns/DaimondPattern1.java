package Patterns;
/*
 *
 *    *
    *   *
   *     *
  *       *
   *     *
    *   *
     * *
      *
* */
public class DaimondPattern1 {
    public static void main(String []args){
        int i,j,n=7;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
               if(i+j+2 == n || i == j+2 || i==j-2){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
