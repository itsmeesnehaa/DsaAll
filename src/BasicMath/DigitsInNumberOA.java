package BasicMath;
import java.util.*;
public class DigitsInNumberOA {
    public static int countDigits(int n){
        int count = (int) (Math.log10(n)+1);
        return count;
    }
    public static void main(String []args) {
        int N = 7789;
        System.out.print("N : "+N);
        int digits = countDigits(N);
        System.out.println("Total number of counts included is :"+digits);
    }
}
