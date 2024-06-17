public class arr2DTranspose {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{7,8,9},{11,23,34}};
        int col=3,row=3;
        int [][] transpose=new int [row][col]; 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=matrix[j][i];
            }
        }
        printtranspose(matrix);
         

    }
    public static void printtranspose(int matrix[][]){
       //int [][] transpose=new int [row][col];
       System.out.println("the transpose matrix is :");
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
       }
    }
}
