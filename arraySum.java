public class arraySum {
public static void main(String[] args) {
   System.out.println("welcome to sum and array");
   int[] numArray=arrayUtility.inputArray();
   long sum=sum(numArray);
   long avg=avg(numArray);
   System.out.println("sum of array is  "+sum);
   System.out.println("avg of array    "+avg);
}  

public static long sum(int[] numArray){
    int index=0;
    int sum=0;
    while(index<numArray.length){
        sum=sum+numArray[index];
        index++;
  
    }
    return sum;
}
public static int avg(int[] numArray){
    long sum=sum(numArray) ;

     return (int) (sum/numArray.length);
}
}