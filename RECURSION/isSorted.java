public class isSorted {
    public static boolean checkSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return checkSorted(arr, i + 1);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2,3,4, 5, 6};
        if (checkSorted(arr, 0)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
