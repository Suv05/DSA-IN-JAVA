public class forInt {

    public static int linerSearch(int[] num, int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] numbers = {1, 8, 20, 79, 6, 48, 25};
        int key = 6;

        int index = linerSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Fond");
        } else {
            System.out.println("index is " + index);
        }
    }
}
