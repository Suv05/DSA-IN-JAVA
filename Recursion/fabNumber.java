import java.util.*;

public class fabNumber {

    public static void series(int[] arr, int s) {
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < s; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

    }

    public static void print(int[] arr, int s) {

        for (int i = 0; i < s; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");
        int s = sc.nextInt();
        int[] arr = new int[s];

        series(arr, s);
        print(arr, s);

    }
}
