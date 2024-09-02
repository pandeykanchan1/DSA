import java.util.Scanner;
public class coutArrayNum {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter num for search count");
      int[] numArry=arrayUtility.inputArray();
      System.out.println("enter the num that you want to find");
      int num=input.nextInt();
      int countNarray=coutArray(numArry, num);
      System.out.println("your num is found"+countNarray);   //array me element kitni bar aaya h
    }

    public static int coutArray(int[] numArray,int num){
      int occ=0;
      int index=0;
      while(index<numArray.length){
        if(numArray[index]==num){
            occ++;
        }
        index++;
      }
       
        return occ;
    }
}
