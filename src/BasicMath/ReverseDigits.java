package BasicMath;
import java.util.*;
public class ReverseDigits {
    public static int reverseDigi(int n){
        int revNum =0;
        while(n>0){
            int lastdigit = n%10;

            revNum = revNum*10+lastdigit;
            n=n/10;
        }
        return revNum;
    }

    public static void main(String []args){
        ReverseDigits reverse = new ReverseDigits();
        int N = 9900;
        System.out.print("Reverse number of given digit is : "+ reverse.reverseDigi(N));
    }
}
