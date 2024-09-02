public class recursion {
    public static void main(String[] args) {
        int n=10;
        printDec(n);
        int num=6;
        prntIncres(num);

    }
    public static void printDec(int n){
     if(n==1){
        System.out.println(n);
        return;
     }
     System.out.print(n+" ");
     printDec(n-1);
    }
    public static void prntIncres(int num){
        if(num==1){
            System.out.print(num+" ");
            return;
        }
        prntIncres(num-1);
        System.out.print(num+" ");
    }
}
