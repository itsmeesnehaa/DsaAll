package Patterns;

/*
 * Pattern without i and j using
 * 15
 * 1413
 * 121110
 * 9876
 * 54321
 * */
public class Pattern15 {
    public static void main(String[] args) {
        int i, j, n = 5;
        int x = 15;
        for (i = 1; i <= n; i++) {
             //intrusion
            for (j = 1; j <= i; j++) {
                System.out.print(x);
                x--;
            }
            System.out.println(" ");
        }

    }
}
