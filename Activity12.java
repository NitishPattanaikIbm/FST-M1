package activities;

public class Activity12 {
    // Functional interface Addable
    @FunctionalInterface
    interface Addable {
        int add(int num1, int num2);
    }
    
    public static void main(String[] args) {
        // First variable with a lambda expression without a body
        Addable ad1 = (num1, num2) -> num1 + num2;
        
        // Second variable with a lambda expression with a body
        Addable ad2 = (num1, num2) -> {
            return num1 + num2;
        };
        
        // Testing the lambda expressions
        System.out.println("Sum using ad1: " + ad1.add(10, 20));
        System.out.println("Sum using ad2: " + ad2.add(30, 40));
    }
}
