	public class OddEvenCheck {

    // Function to check if a number is odd or even using bit manipulation
    public static String checkOddEven(int num) {
        if ((num & 1) == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 3;

        System.out.println(num1 + " is " + checkOddEven(num1)); // Output: Even
        System.out.println(num2 + " is " + checkOddEven(num2)); // Output: Odd
    }
}
