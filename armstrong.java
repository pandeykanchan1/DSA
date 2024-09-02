import java.util.Scanner;;
public class armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number for armstrong checking");
        int num=input.nextInt();
        boolean isArmstrong=isArmstrong(num);
        if(isArmstrong){
            System.out.println("your num is armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
    public static boolean isArmstrong(int num){
        int nodigits=noDgit(num);
        int numCopy=num;
        int finalNumber=0;
        while(num>0){
            int lastdigit=num%10;
            num/=10;
            finalNumber+=pow(lastdigit, finalNumber);

        }

        return finalNumber==numCopy;
    }
   public static int pow(int num1,int num2){
         int result=num1;
         int i=1;
         while (i<num2) {
            result*=num1;
            i++;
         }
         return result;

   }


    public static int noDgit(int num){
        int digits=0;
        while(num>0){
            digits++;
            num/=10;
        }
        return digits;
    }
}
