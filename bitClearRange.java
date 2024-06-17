public class bitClearRange {
    public static void main(String[] args) {
        System.out.println(clearBits(10, 2, 4));

    }
    public static int clearBits(int i,int j ,int n){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask =a|b;
        return n & bitMask;
    }
}
