public class InsertionSort {
    public static void shorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int prev = i;
            int curr = arr[i];
            //finding correct position to insert
            while (prev > 0 && arr[prev-1] > curr) {
                arr[prev] = arr[prev-1];
                prev--;
            }
            //insertion
            arr[prev] = curr;
        }
    }

    public static void print(int[] arr) {
        for (int item : arr
        ) {
            System.out.print(" " + item);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 8, 6, 4, 3, 12};
        shorting(array);
        print(array);

    }
}
