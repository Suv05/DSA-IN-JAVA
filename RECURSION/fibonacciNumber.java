public class fibonacciNumber {
    public static int fibo(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibo(n-2) + fibo(n - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
