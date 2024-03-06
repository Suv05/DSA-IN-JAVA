public class countSorting {
    public static void sorting(int[] arr) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for (int i = 0; i < count.length ; i++) {
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }

    public static void print(int[] arr) {
        for (int j : arr
        ) {
            System.out.print(" " + j);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 6, 3, 3, 1, 2, 1, 5};
        sorting(arr);
        print(arr);
    }
}
