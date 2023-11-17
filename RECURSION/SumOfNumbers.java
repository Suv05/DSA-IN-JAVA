public class SumOfNumbers {
    public static int sumOfNumbers(int n) {
        if (n == 0) {
            return 0;
        }else {
            return n+sumOfNumbers(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(10));
    }
}
