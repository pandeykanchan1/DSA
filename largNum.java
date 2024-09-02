import java.util.Scanner;

public class largNum {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int[] number={1,3,5,7,8};
        System.out.println("largest num is :"+ArrayLarge(number));
    }
    public static int ArrayLarge(int[] number){
        int large=Integer.MIN_VALUE;   // -infinity
       for(int i=0;i<number.length;i++){
           if(large<number[i]){
            large=number[i];
           }
       }
       return large;
    }

}
