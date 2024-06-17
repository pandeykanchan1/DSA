public class ArryMaxSubArr {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10}; 
        maxSubARR(numbers);
    }
    public static void maxSubARR(int numbers[]){

   int currSum=0;
   int MaxSum=Integer.MIN_VALUE;

        for(int i=0;i<=numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                  //  System.out.print(numbers[k]+" ");   //prnt subarr
                   //sub ArrayMax VALUE
                   currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(MaxSum<currSum){
                    MaxSum=currSum;
                }
            } 
        }
        System.out.println("max sum  "+MaxSum);


    }
   // System.out.println("max sum  "+MaxSum);


}
