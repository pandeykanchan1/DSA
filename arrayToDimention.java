public class arrayToDimention {
    public static void main(String[] args) {
        //2D Array
     //declare of 2d aaray

     int[][] arr={{1,4,7},{6,9,45},{6,7,6}};
      System.out.println(arr[1].length);
      int i=0;

      //2d traverse  

      
      while(i<arr.length){
        int j=0;
        while(j<arr[i].length){
           
            System.out.print(arr[i][j]+"   ");
            j++;
        }
        System.out.println();
        i++;
      }



      // declare of array
      int[][] myArry=new int[2][4];
      myArry[0][0]=8;
      myArry[2][3]=90;
    }
}
