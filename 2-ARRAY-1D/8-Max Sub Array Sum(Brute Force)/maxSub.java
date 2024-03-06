public class maxSub {
    public static int maxSum(int[] num) {
        int currentSum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += num[k];
                }
                System.out.println(currentSum);
                if (maxsum < currentSum) {
                    maxsum=currentSum;

                }
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {

        int[] array = {1, -5, 8, -9, 5};
        //int []array={2,4,6,8,10};
        System.out.println("Sum: "+ maxSum(array));

    }
}
