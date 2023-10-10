import java.util.*;

public class RotateAnArray {
    public static void subReverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

    public static void print(int[] arr) {
        for (int j : arr
        ) {
            System.out.print(" " + j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //rotate position
        System.out.println("Enter your position");
        int k = sc.nextInt();

        int l = arr.length - 1 - k;
        subReverse(arr, 0, l);
        subReverse(arr, l+1, arr.length - 1);
        subReverse(arr,0, arr.length-1);
        print(arr);
    }
}
