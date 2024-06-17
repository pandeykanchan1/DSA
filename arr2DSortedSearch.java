public class arr2DSortedSearch {
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                       {15,25,35,45},
                        {27,29,39,48},
                         {23,33,34,35,}};
       int key=33;
      // System.out.println();
       stairSearch(matrix, key);


     }
     public static boolean stairSearch(int matrix[][],int key){
      int row=0, col=matrix[0].length-1;
      while(row<matrix.length && col>=0){
        if(matrix[row][col]==key){
          System.out.println("found key at index"+row+" ,"+col);
          return true;
        }else if(key<matrix[row][col]){
                col--;
        }else{
          row++;
        }
      }
      return false;
      //System.out.println("key not found");
     }
}
//time complexity is  o(n+m);