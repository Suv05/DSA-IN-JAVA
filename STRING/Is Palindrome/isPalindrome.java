import java.util.*;

public class isPalindrome {
    public static boolean checkPalindrome(String input) {
        int n = input.length();
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) != input.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String input = sc.next();
        if (checkPalindrome(input)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }

    }
}
