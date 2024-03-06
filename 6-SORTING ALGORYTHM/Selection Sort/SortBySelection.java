public class SortBySelection {
    public static void sorting(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }

            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

    }

    public static void printing(int[] arr) {
        for (int item : arr) {
            System.out.print(" " + item);
        }
    }

    public static void main(String[] args) {

        int[] array = {5, 8, 2, 4, 1, 7, 6};
        sorting(array);
        printing(array);
    }
}
