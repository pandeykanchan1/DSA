public class bitIthBitUpadate {
    public static void main(String[] args) {
        System.out.println(upadateIthBit(5, 2, 1));
    }
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMsk= ~(1<<i);
        return n & bitMsk;
    }

    public static int upadateIthBit(int n,int i,int newBit){
        if(newBit==0){
            return clearIthBit(n, newBit);
        }else{
            return setIthBit(n, i);
        }
    }

}
