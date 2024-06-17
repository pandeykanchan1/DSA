public class bitGETithBit {
    public static void main(String[] args) {
        System.out.println(getIthbit(10, 3));
    }
    public static int getIthbit(int n,int i){
        int bitMask= 1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{

    return 1;

        }
     
    } 
    
}
