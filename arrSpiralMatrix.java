import java.util.Scanner;

public class arrSpiralMatrix {
    public static void prinTSpiral(int[][] matrix){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow <= endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");

            }

            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[endCol][i]+" ");

            }

            //bottom
            for(int j=endCol;j>=startRow;j--){
                if(startRow==endRow){
                   // return;
                   break;
                }
                System.out.print(matrix[endRow][j]+" ");

            }
            
            //left
            for(int i=endRow-1;i>=matrix[i][startCol];i--){
              
                if(startCol==endCol){
                    // return;
                    break;
                 }
              
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                       prinTSpiral(matrix);
   
   
                    }
}
