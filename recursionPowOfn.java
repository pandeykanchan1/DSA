public class recursionPowOfn {
    public static void main(String[] args) {
        //print x^n
        System.out.println(powOfn(2, 10));
    

        //optimezied code for x^n
        System.out.println(power(2,5));
    }
    public static int powOfn(int x,int n){
       if(n==0){
        return 1;
       }
        int xnm1=  powOfn(x, n-1);
      int xn=x*xnm1;
      return xn;
    }


//optimized method 

//print x^n



public static int power(int x,int n){
  if(n==0){
    return 1;
  }
   int   halfPowr  =power(x,n/2);
  //int halfPowSqr= power(x,n/2)*power(x,n/2);
    int  halfPowSqr=halfPowr*halfPowr;
  // n is odd
    if(n%2!=0){
       halfPowSqr=x*halfPowSqr; 
    }
    return halfPowSqr;
}

}




