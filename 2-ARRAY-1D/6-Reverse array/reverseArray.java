public class reverseArray {
    public static void reverse(int[] num) {
        int first = 0, last = num.length - 1;

        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }


    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 8, 7, 6};
        reverse(array);

        for (int element : array) {
            System.out.print(" " + element);
        }
    }
}
