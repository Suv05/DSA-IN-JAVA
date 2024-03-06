public class positiveInt {
    public static int find(int[] arr) {
        //bruteForce
/*        for (int i = 1; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found && i > 0) {
                return i;
            }
        }
        return 1;*/







    }

    public static void main(String[] args) {
        int[] arr = {2, 1, -3, 5, -2, 3, -1};
        System.out.println(find(arr));

    }
}
