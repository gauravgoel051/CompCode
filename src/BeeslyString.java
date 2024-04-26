import java.util.Scanner;

public class BeeslyString {

    static int solve(String A){

        int mCount = 0;
        int pCount = 0;
        int aCount = 0;

        for(int i =0;i<A.length();i++){
            if(A.charAt(i)=='a'){
                aCount++;
            }
            else if(A.charAt(i)=='p'){
                pCount++;
            }
            else if(A.charAt(i)=='m'){
                mCount++;
            }
        }
        if(mCount==2*pCount && mCount==2*aCount){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String that contains only 'p','a' & 'm'");
        String A = sc.next();
        System.out.println(solve(A));
    }
}
