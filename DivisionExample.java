package labprograms;

// Custom exception class
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class DivisionExample {
    // Method to divide two numbers
    public static double divide(int numerator, int denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("Error: Division by Zero is not allowed");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        int num = 10;
        int den = 10;

        try {
            double result = divide(num, den);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exception handling completed, cleaning up resources if needed.");
        }
    }
}
