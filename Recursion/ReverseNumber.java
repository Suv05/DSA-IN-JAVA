public class ReverseNumber {
     //stores reversed number
    static int rev = 0;

    // Function to reverse the number
    static void reverse(int n) {

        if (n <= 0)
            return;

        int rem = n % 10;  // remainder

        rev = (rev * 10) + rem;

        reverse(n / 10);
    }
    public static void main(String[] args) {
        int number = 12345;
        reverse(number);
        System.out.println("Original number: " + number);
        System.out.print("Reversed Number is " + rev);

    }

}
