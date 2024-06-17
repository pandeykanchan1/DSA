public class arrDiogonalSum {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                         {13,14,15,16}};
      //  diogonalMatrix(matrix);
      System.out.println(diogonalMatrix(matrix));
        

    }
    public static int diogonalMatrix(int matrix[][]){    //time complexity o(n^2)
       int sum=0;
      
      /* 
       for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                  sum+=matrix[i][j];
                }else if(i+j== matrix.length-1){

                    sum+=matrix[i][j];

                }
            }
        }
            */

          //  secand methode

            for(int i=0;i<matrix.length;i++){     //time complexity o(n)
                //primary diogonal
                sum+=matrix[i][i];

                //secanday digonal
                if(i!=matrix.length-1-i)
                sum += matrix[i][matrix.length-i-1];
            }
        return sum;
    }
}
