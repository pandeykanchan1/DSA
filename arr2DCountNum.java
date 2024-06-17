public class arr2DCountNum {
    public static void main(String[] args) {
        //find how may 7 present in 2d arry
        int[][] matrix={{4,7,8},
                        {8,8,7}};
                        int key=7;
                       // arrcount(matrix,key);
                       System.out.println(arrcount(matrix, key));
                        print2DArr(matrix);
    }
    public static int arrcount(int[][]matrix,int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                   count++; 
                }
            }
        }
        return count;
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
