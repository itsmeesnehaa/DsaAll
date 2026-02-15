package Patterns;

/*
 * Pattern without i and j using
 * 5
 * 54
 * 543
 * 5432
 * 54321
 * */
public class Pattern14 {
    public static void main(String[] args) {
        int i, j, n = 5;
        int x = 5;
        for (i = 1; i <= n; i++) {
            x=5; //intrusion
            for (j = 1; j <= i; j++) {
                System.out.print(x);
                x--;
            }
            System.out.println(" ");
        }

    }
}
