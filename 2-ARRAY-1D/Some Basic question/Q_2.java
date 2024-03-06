import java.util.*;

public class Q_2 {
    public static void main(String[] args) {
//Write a Java program to find the largest element in an array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of your array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your" + i + "th element");
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        int largest=arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]>largest) {
               largest=arr[j];
            }
        }
        System.out.println("The largest element in the array is "+largest);
    }

}
