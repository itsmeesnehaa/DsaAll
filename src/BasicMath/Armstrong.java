package BasicMath;
import java.util.*;
public class Armstrong {
    public boolean amrstrongnumber(int N){
        int k = (int) Math.log10(N) + 1; //value conversion and getting length
        int dup = N;
        int sum=0;

        while(N>0){
            int lastdigit = N%10;
            sum += Math.pow(lastdigit, k);
            //sum = sum +(lastdigit*lastdigit*lastdigit*lastdigit);
            N=N/10;
            //revNum = revNum*10+lastdigit;
        }
        System.out.println(k);
        return dup == sum;
    }
    public static void main(String []args){
        int num=1634;
        Armstrong obj1 = new Armstrong();
        if(obj1.amrstrongnumber(num)){
            System.out.println("yes it is armstrong");
        }
        else {
            System.out.println("Not a armstrong");
        }
    }
}
