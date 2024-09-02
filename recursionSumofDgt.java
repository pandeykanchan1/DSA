public class recursionSumofDgt {
    public static void main(String[] args) {
        int n;
        System.out.println(sum(5));
    }
    public static int sum(int n){
      if(n==1){
        return 1;
      }
      int snm1=sum(n-1);
      int sn=n+snm1;
      return sn;


    }
}
