public class matrixsum {
    public static void main(String[] args) {
        int[][] A = {{1,2},{3,4},{5,6}};
        int[] res = matrixSum(A);
        for(int i : res){
            System.out.println(i);
        }
    }
    public static int[] matrixSum(int[][] A){
        int[] res = new int[A.length+A[0].length];
        int counter=0;
        for(int i=0;i< A.length;i++){
            int sum = 0;
            for(int j=0;j<A[i].length;j++){
                sum+=A[i][j];
            }
            res[counter]=sum;
            counter++;
        }
        for(int i=0;i<A[0].length;i++){
            int sum =0 ;
            for(int j=0;j<A.length;j++){
                sum+=A[j][i];
            }
            res[counter]=sum;
            counter++;
        }
        return res;
    }
}
