package Patterns;

/*
 * Pattern without i and j using
 * 1
 * 23
 * 456
 * 78910
 * 1112131415
 * */
public class Pattern13 {
    public static void main(String[] args) {
        int i, j, n = 5;
        int x = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(x);
                x++;
            }
            System.out.println(" ");
        }

    }
}
