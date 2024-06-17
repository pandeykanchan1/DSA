public class bitClearIthBit {
    public static void main(String[] args) {
       System.out.println(clearIthBit(4, 2));
    }
    public static int clearIthBit(int n, int i){
        int bitMsk= ~(1<<i);
        return n & bitMsk;
    }

}
