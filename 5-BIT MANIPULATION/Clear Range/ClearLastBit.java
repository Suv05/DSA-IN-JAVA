public class ClearLastBit {

    public static int clearBit(int n, int i) {
        int bitmask = (-1) << i;
        return bitmask & n;
    }

    public static int clearRange(int n, int i, int j) {
        int a = (-1) << j + 1;
        //int b = (int) Math.pow(2, i - 1) +1;
        // same as above
        int b=(1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean checkPowerOfTwo(int n){
        //bcz 4 and 3 ra & always zero
        //8 & 7 always zero
        return( n&(n-1))==0;
    }

    public static void main(String[] args) {
        System.out.println(clearBit(11, 2));
        System.out.println(clearRange(10,2,4));
        System.out.println(checkPowerOfTwo(16));
    }
}
