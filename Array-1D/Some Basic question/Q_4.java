import java.util.*;

public class Q_4 {
    //Write a Java program to find the average of all elements in an array.
    public static void main(String[] args) {
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
        System.out.println("Avg of all elements is " + sum / n);

    }
}
