import java.util.Scanner;

public class arr2DMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //declaration of 2D Array

       int matrix[][]=new int[3][4];
       for(int i=0;i<3;i++){
         for(int j=0;j<4;j++){
          System.out.print("enter elements");   //input 2d elemnts
          matrix[i][j]=input.nextInt();
         }
       }
      // maxments(matrix);
      System.out.println("max num is :"+maxments(matrix));
       print2DArr(matrix);

    }
    public static int maxments(int[][] matrix){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
        }
        return max;
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
