import java.math.BigInteger;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        int[][] a = {{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int[]  res = new int[a.length+a[0].length];
        int count =0;


        for(int i =0; i<a.length;i++){
            int sum =0;
            for(int j=0;j<a[i].length;j++){

                sum=sum +a[i][j];
            }
            res[count]=sum;
            count++;
        }
        for(int i =0; i<a.length;i++) {
            int sum =0;
            for (int j = 0; j < a[i].length; j++) {

                sum =sum+a[j][i];

            }
            res[count]=sum;
            count++;

        }

        for(int i =0;i<res.length;i++){
            System.out.println(res[i]);
        }


    }
}




