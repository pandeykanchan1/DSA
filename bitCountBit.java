public class bitCountBit {
    public static void main(String[] args) {
        System.out.println(countSetBAITS(10));
    }
    public static int countSetBAITS(int n){
        int count=0;
        while(n>0){
          if((n & 1) !=0){   //check list significant
            count++;
          }  
          n=n>>1;
        }
        return count;
    }


}
//time complexity o(lon n)
//google amazon
