package HashMap;
import java.util.*;
public class HashMap1 {
    public static void main(String []args){

        HashMap<Integer,Integer> h=new HashMap<>();
        // Create a occurances of an elements of array

        int []arr = {10,20,30,40,30,30,20,10,10,10,20,34,29};

        for(Integer i:arr){
            if(h.containsKey(i)){
                int count = h.get(i);
                count ++;
                h.put(i,count);
            }
            else{
                h.put(i,1);
            }

        }
        System.out.println(h);
    }
}
