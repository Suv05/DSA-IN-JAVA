public class maxSubArraySum {
    public static void kedanes(int[] num) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            currentSum += num[i];
            if (currentSum <= 0) {
                currentSum = 0;
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Max sum: " + maxSum);
    }

    public static void main(String[] args) {
        int[] array = {5, -2, -8, 9, -1, -2, 10, 7};
        kedanes(array);
    }
}
