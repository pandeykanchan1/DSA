public class bitClearIthbits {
    public static void main(String[] args) {
        System.out.println(clearIthbit(15, 2));
    }
    public static int clearIthbit(int n,int i){
        int bitMsk=(~0)<<i;
        return n& bitMsk;
    }
}
