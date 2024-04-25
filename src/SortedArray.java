import java.util.Scanner;
public class SortedArray {

    static int solve(int[]A){

        int a =0;
        for(int i=0;i<A.length-1;i++){

            if(A[i]>A[i+1]){
                a=0;
                break;
            }
            else{
                a=1;
            }
        }
        return a;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter array length");
        int len = sc.nextInt();

        int[] A = new int[len];

        System.out.println("Enter elements of array");
        for(int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }

        System.out.println(solve(A));
    }
}
