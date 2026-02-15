package Patterns;

/*
 * Pattern without i and j using
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * */
public class Pattern12 {
    public static void main(String[] args) {
        int i, j, n = 5;
        int x = 1;
        for (i = 1; i <= n; i++) {
            x=1; //intrusion
            for (j = 1; j <= i; j++) {
                System.out.print(x);
                x++;
            }
            System.out.println(" ");
        }

    }
}
