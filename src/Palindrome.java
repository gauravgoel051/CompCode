import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {


        System.out.println(ispalindrome(-12233221));

    }


    static boolean ispalindrome(int x){
        int a =x;

        if(a<0){
            return false;
        }
        int rev=0;
        while(x!=0){
            int temp = x%10;
            rev=rev*10+temp;
            x=x/10;
        }

            return (a==rev);


    }
}
