public class recursionFibnnoci {
    public static void main(String[] args) {
       int n=25;
        System.out.println(finnoci(n));
    }
    public static int finnoci(int n){
        if(n==1 || n==0){
            return n;
        }
        int fnm1=finnoci(n-1);  //1
        int fnm2=finnoci(n-2);   //2
        int fn=fnm1+fnm2;
        return fn;
    }
}
