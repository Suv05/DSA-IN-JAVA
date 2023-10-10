import java.util.*;

public class Q_1 {
    public static void main(String[] args) {
        //Write a Java program to calculate the sum of all elements in an array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of your array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your" + i + "th element");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

