import java.util.*;

public class Example1 {
    public static void onePluse(int[] a, int nonChangeAble) {
        nonChangeAble = 5;
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int nonChangeAble = 10;
        onePluse(arr, nonChangeAble);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println('\n');
        System.out.println(nonChangeAble);
    }
}
