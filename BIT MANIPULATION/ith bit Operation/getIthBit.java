public class getIthBit {

    public static int getBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int n, int i) {
        int bitmask = 1 << i;
        return (n | bitmask);
    }

    public static int clearBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int update(int n,int i,int newBit){
        if(newBit==0){
            return clearBit(n,i);
        }else {
            return setBit(n,i);
        }
    }

    public static void main(String[] args) {
        System.out.println(getBit(11, 2));
        System.out.println(setBit(10, 2));
        System.out.println(clearBit(10, 1));
        System.out.println(update(10,2,1));
    }
}
