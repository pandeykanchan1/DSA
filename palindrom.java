import java.util.Scanner;;
public class palindrom {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter num for checking plindrom or not");
        int numbr=input.nextInt();
        int resvrse=revrse(numbr);
        System.out.println(resvrse);
        if(resvrse==numbr){
            System.out.println("this number is palindrom");
        }else{
            System.out.println("this number not palidrom");
        }

    }
    public static int revrse(int numbr){
      int newNum=0;
      while(numbr>0){
        int digit=numbr%10;
        newNum=newNum*10+digit;
        numbr/=10;

      }
      return newNum;
    }
}
