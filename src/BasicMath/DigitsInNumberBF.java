package BasicMath;
public class DigitsInNumberBF {
    public static int countDigit(int n){
        int count = 0;
        while(n>0) {
            count++;
            n = n / 10;
//          System.out.println(n);
        }
        return count;
    }
    public static void main(String []args){
        int N=12345;
        System.out.println("N = "+N);
        int digits = countDigit(N);
        System.out.println("Number of Count of digits :"+digits);
    }
}
/*
* Time Complexity is log10N as divided by 10 and N times with while iterator +1
* TC : O(log10N+1)
*
* Space Complexity is O(1)
* */