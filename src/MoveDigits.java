import java.util.Scanner;

public class MoveDigits {

    static int[] MoveDigit(int[] A, int dig) {
        int end = A.length;
        int start = 0;
        int[] b = new int[end];

        for (int i = 0; i < A.length; i++) {
            if (A[i] != dig) {
                b[start] = A[i];
                start++;

            } else {
                b[end - 1] = A[i];
                end--;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  length of array");
        int a = sc.nextInt() ;

        int[] arr = new int[a];

        System.out.println("Enter digits of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the digit you want to move");
        int move = sc.nextInt();

        int[] res = MoveDigit(arr,move);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
