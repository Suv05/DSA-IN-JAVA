public class CountSetBits {
    public static int countSet(int n) {
        int count = 0;
        while (n > 0) {
            //check least significant bits
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }

        return count;
    }

    public static int fastExpotention(int a, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countSet(15));
        System.out.println(fastExpotention(3, 5));
    }
}
