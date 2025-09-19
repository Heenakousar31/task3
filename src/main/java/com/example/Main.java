package com.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Sample names list
        List<String> names = Arrays.asList("Kaveri", "Ravi", "Anita", "Sunil");

        // Filter names starting with A or S
        List<String> filtered = names.stream()
                .filter(n -> n.startsWith("A") || n.startsWith("S"))
                .collect(Collectors.toList());

        System.out.println("Filtered Names: " + filtered);

        // Create Calculator instance and call methods
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(12, 8));
        System.out.println("Factorial of 5: " + calc.factorial(5));
    }
}

// Top-level Calculator class (NOT public)
class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to calculate factorial
    public long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
