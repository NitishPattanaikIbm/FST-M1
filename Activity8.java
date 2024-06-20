package activities;

class CustomException extends Exception {
    // Private variable to store the exception message
    private String message;

    // Constructor to initialize the message variable
    public CustomException(String message) {
        this.message = message;
    }

    // Override the getMessage() method to return the custom message
    @Override
    public String getMessage() {
        return message;
    }
}

// MainClass.java
public class Activity8 {

    // Method to test for exception
    public static void exceptionTest(String value) throws CustomException {
        if (value == null) {
            throw new CustomException("Input string is null.");
        } else {
            System.out.println("Input string: " + value);
        }
    }

    public static void main(String[] args) {
        try {
            // Call exceptionTest() with a non-null string
            exceptionTest("Hello, world!");
            
            // Call exceptionTest() with a null value
            exceptionTest(null);
        } catch (CustomException e) {
            // Print the custom error message
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}