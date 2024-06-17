import java.util.Scanner;

public class arr2D {
  public static boolean search(int matrix[][],int key){
   for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[0].length;j++){
     if(matrix[i][j]==key){
      System.out.println("key is found at cell  ,"+i+" ,"+j);
        return true;
     }
    }
   }
   System.out.println("key not found");
   return false;
  }
    public static void main(String[] args) {
        int matrix[][]=new int[3][4];
        Scanner input=new Scanner(System.in);
        int n=3 ,m=3;
        for(int i=0;i<n;i++){   //row
          for(int j=0;j<m;j++){   //column
            System.out.print("enter elements");
            matrix[i][j]=input.nextInt();

          }
        }

        //output print

       // int n=3 ,m=3;
        for(int i=0;i<n;i++){   //row
          for(int j=0;j<m;j++){   //column
        System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
        }
        search(matrix, 5);



    }
}
