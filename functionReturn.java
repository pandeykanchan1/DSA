import java.util.Scanner;

public class functionReturn {
    public static void main(String[] args) {
        int num=sumNum(2, 5);
        System.out.println(num);
      //  System.out.println(sumNum(3, 8));
      
    }    
    public static int sumNum(int a ,int b){
      int sum=a+b;
      return sum;
    }

}
