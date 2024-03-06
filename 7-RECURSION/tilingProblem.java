public class tilingProblem {
    public static int noOfWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int fnm1 = noOfWays(n - 1);
            int fnm2 = noOfWays(n - 2);
            return fnm2+fnm1;
        }
    }

    public static void main(String[] args) {
        System.out.println(noOfWays(5));

    }
}
