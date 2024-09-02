public class array2dSumAvg {
   public static void main(String[] args) {
    int[][] arr=arrayUtility.input2DArray();
    System.out.println("sum and avg of TWO diomentional array");
    int sum=summ(arr);
    System.out.println("sum of 2nd Array  :"+sum);

    int avg=avgg(arr);
    System.out.println("avg of array is  :"+avg);
     
   } 
   public static int summ(int[][] arr){
    int sum=0;
    int i=0;
    while(i<arr.length){
        int j=0;
        while(j<arr[i].length){
          //  int sum=0;
            sum=sum+arr[i][j];
            j++;
        }
        i++;
    }
    return sum;
   }

   public static int avgg(int[][] arr){
    int sum=summ(arr);
    int avg=sum/arr.length;
    return avg;
   }
}
