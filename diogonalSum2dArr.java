public class diogonalSum2dArr {
    public static void main(String[] args) {
        int[][] arr=arrayUtility.input2DArray();
        System.out.println("sum of digonal element of the 2D arry");
      long sum=sumOFDiogonal(arr);
      System.out.println("sum of digonal element "+sum);
    }


    public static long sumOFDiogonal(int[][] arr){
        long leftsum=sumOFLeftDiogonal(arr);
        long righSum=sumOFRightDiogonal(arr);
       long sum=leftsum+righSum;
        if(arr.length%2!=0){
        int ind=arr.length/2;
        sum  -= arr[ind][ind];
        }
        return sum;
    }


    public static long sumOFRightDiogonal(int[][] arr){
        long sum=0;
        int i=0;
        while(i<arr.length){
            int col=arr.length-1-i;
            sum += arr[i][col];
            i++;
        }
        return sum;
    }



    public static long sumOFLeftDiogonal(int[][] arr){
        long sum=0;
        int i=0;
        while(i<arr.length){
           sum += arr[i][i];
            i++;
        }
        return sum;
    }
    
    

}
