import java.util.*;
public class binarySearch {
    public static int searchBinary(int[] num, int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            //comparison
            if (num[mid] == key) { //found
                return mid;
            }

            if (num[mid] < key) {  //right
                start = mid + 1;
            } else {
                end = mid - 1;    //left
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 9, 15, 21, 2, 75};
        int key = 2;

        // Sort the array before applying binary search
        Arrays.sort(numbers);
        System.out.println(searchBinary(numbers, key));
    }
}
