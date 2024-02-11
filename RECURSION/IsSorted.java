public class IsSorted {
    public static boolean checkSort(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        } else if (arr[i] > arr[i + 1]) {
            return false;
        } else {
            return checkSort(arr, i + 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 4, 5};
        if (checkSort(arr, 0)) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is unsorted");
        }
    }
}
