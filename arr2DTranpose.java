public class arr2DTranpose {
    public static void main(String[] args) {
        int[][] matrix={{1,3,4}
                       ,{6,8,9}
                         ,{11,12,14}};
                     //    transpose(matrix);
                     tanspose(matrix);
                         print2DArr(matrix);
    }
    public static void tanspose(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
           matrix[i][j]=matrix[j][i];
            }
        }
    }

    public static void print2DArr(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
        }
    }
}
