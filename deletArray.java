import java.util.Scanner;

public class deletArray {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        System.out.println("welcom to array deletion");
       int[] numarr=arrayUtility.inputArray();
       System.out.println("now enter the number that you want to delet");
     int numdelt=input.nextInt();
     int [] newarr=deletnum(numarr, numdelt);
     System.out.println("new array after deletion   :");
     arrayUtility.displayArray(newarr);
    }
    public static int[] deletnum(int[] numarr,int numdelt){
    int occ=coutArrayNum.countNarray()
   
        return 0;
}
}
