package BasicMath;

public class Palindrome {
    public boolean checkPalindrome(int p){
        int store = p;
        int revNum =0;
        while(p>0){
            int lastdigit = p%10;
            revNum = revNum*10 + lastdigit;
            p= p/10;
        }
        return store == revNum;
    }
    public static void main(String []args){
        int num = 121;
        Palindrome onj1=new Palindrome();
        if(onj1.checkPalindrome(num)) {
            System.out.println("This is a palindrome number: " + num);
        }
        else{
            System.out.println("This is not a palindrome"+ num);
        }
    }

}

/*
* TC will be O(log10N +1)
* SC will be O(1)
* */
