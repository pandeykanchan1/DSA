import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int[] numbers={10,12,34,10,54};
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int n=input.nextInt();
        linerSerach(numbers, n);
        if(linerSerach(numbers, n)){
            System.out.println("your number is found");
        }else{
            System.out.println("your number is not found");
        }
    
    }

    public static boolean linerSerach(int[] numbers,int n){
        for(int i=0;i<numbers.length;i++){
            if(n==numbers[i]){
              // System.out.println("key find");
             return   true;
            }
           // return false;
              
        }
        return false;
    }
    }
