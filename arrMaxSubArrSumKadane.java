public class arrMaxSubArrSumKadane {
    public static void main(String[] args) {
        int[] numbers={-2,-3,4,-1,-2,1,5,-3};
        kadaneMaxSumSub(numbers);
    }
    public static void kadaneMaxSumSub(int numbers[]){
      int maxSum=Integer.MIN_VALUE;  //-infinit
      int currSum=0;
      for(int i=0;i<numbers.length;i++){
        currSum =currSum+numbers[i];
        if(currSum<0){
            currSum=0;

        }
        maxSum=Math.max(currSum,maxSum);

      }
      System.out.println("our max subArrySum  :"+maxSum);
    }
}
