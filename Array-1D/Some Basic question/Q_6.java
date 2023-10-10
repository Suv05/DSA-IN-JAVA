import java.util.*;

public class Q_6 {
    public static void main(String[] args) {
// Write a Java program to find the second-largest element in an array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Enter array elements
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array elements of " + i + " th position");
            arr[i] = sc.nextInt();
        }
        //Print array...
        for (int element : arr) {
            System.out.println(element);
        }

        int largest = arr[0];
        int secondLargest = arr[0];
        for (int element : arr) {
            if (element > largest) {
                largest = element;
            }
        }
        for (int element:arr) {

        }
    }
}
