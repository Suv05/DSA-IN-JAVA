import java.util.*;
public class smallestElement {
    public static int findSmall(int[] num) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }

        return smallest;
    }
    public static void main(String[] args) {
        int[] numbers = {5, 6, 8, 78, 98, 5284, 468, 48, 4800, 888};
        System.out.println("largest number is " + findSmall(numbers));
    }
}
