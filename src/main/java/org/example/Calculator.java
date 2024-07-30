package org.example;

public class Calculator {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter must be non-negative.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("Parameters must be non-negative and k must not exceed n.");
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Valid calculations
        System.out.println("Factorial of 5: " + calculator.factorial(5)); // Outputs: 120
        System.out.println("Binomial coefficient of (5, 2): " + calculator.binomialCoefficient(5, 2)); // Outputs: 10

         System.out.println("Binomial coefficient of (5, -1): " + calculator.binomialCoefficient(5, -1));
         System.out.println("Binomial coefficient of (5, 6): " + calculator.binomialCoefficient(5, 6));
    }
}
