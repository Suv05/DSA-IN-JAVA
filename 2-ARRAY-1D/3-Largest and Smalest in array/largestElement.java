import java.util.*;

public class largestElement {
    public static int findLarge(int[] num) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 6, 8, 78, 98, 5284, 468, 48, 4800, 888};
        System.out.println("largest number is " + findLarge(numbers));
    }
}
