public class lastOccurrence {
    public static int last(int[] arr, int k, int i) {
        if (i == -(arr.length)) {
            return -1;
        } else if (arr[i] == k) {
            return i;
        } else {
            return last(arr, k, i - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 7, 9, 3, 5, 6, 3};
        System.out.println(last(arr, 3, arr.length - 1));


    }
}
