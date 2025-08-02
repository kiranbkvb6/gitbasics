package GitBasics;

public class recursion {
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = factorial(n);
        System.out.println("Factorial" + n + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
}
