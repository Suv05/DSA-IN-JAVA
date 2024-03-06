import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
//Write a Java program to count the number of even and odd elements in an array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of your array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter your" + i + " th element");
            arr[i] = sc.nextInt();
        }
        //Here is the array
        for (int element : arr) {
            System.out.println(element);
        }

        int evenCount = 0;
        int oddCount = 0;
        for (int element : arr) {
            if (element % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);

    }
}
