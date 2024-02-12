public class firstOccurrence {
    public static int checkOccurrence(int[] arr, int k, int i) {
        if (i == arr.length - 1) {
            return -1;
        } else if (arr[i] == k) {
            return i;
        } else {
            return checkOccurrence(arr, k, i+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 1, 5, 3, 9};
        int k = 3;
        int i = 0;
        System.out.println(checkOccurrence(arr, k, i));

    }
}
