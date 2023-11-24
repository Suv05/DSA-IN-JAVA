public class lastOccurrence {
    public static int checkLastOccurrence(int[] arr, int key, int index) {
        // Base case: if the index is negative, the element is not found
        if (index < 0) {
            return -1;
        }

        // Recursive case: check if the element at the current index is the key
        if (arr[index] == key) {
            return index;
        } else {
            // If not, recursively search in the sub array before the current index
            return checkLastOccurrence(arr, key, index - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 9, 6, 5, 4, 5, 7};
        int key=5;

        int result=checkLastOccurrence(arr, 5, arr.length-1);
        if (result != -1) {
            System.out.println("The last occurrence of " + key + " is at index " + result + ".");
        } else {
            System.out.println(key + " is not present in the array.");
        }
    }
}
