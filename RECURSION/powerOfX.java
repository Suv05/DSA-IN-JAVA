public class powerOfX {
    public static int power(int x, int pow) {
        if (pow == 0) {
            return 1;
        } else if (pow == 1) {
            return x;
        } else {
            return x * power(x, pow - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(power(5, 4));
    }
}
