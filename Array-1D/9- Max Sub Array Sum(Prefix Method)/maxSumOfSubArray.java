public class maxSumOfSubArray {
    public static void maxPrefixSum(int[] num) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int[] preFix = new int[num.length];

        //prefix-array declaration
        preFix[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            preFix[i] = preFix[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;

                currentSum = start == 0 ? preFix[end] : preFix[end] - preFix[start - 1];

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("max sum:" + maxSum);
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        //int[] array = {1, -5, -8, 15, 9};
        maxPrefixSum(array);
    }
}
