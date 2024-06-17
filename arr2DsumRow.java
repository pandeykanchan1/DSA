public class arr2DsumRow {
    public static void main(String[] args) {
        int[][] matrix={{1,4,9},
                       {11,4,3},
                        {2,2,3}};
                        //arrSum(matrix);
                        System.out.println(arrSum(matrix));
                        
    }
    public static int arrSum(int[][]matrix){
      int  sum=0;
        for(int j=0;j<matrix.length;j++){
         sum+=matrix[1][j];
        }
        return sum;

    }
}
