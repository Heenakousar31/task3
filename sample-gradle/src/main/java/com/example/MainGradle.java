package com.example;

import java.util.HashMap;
import java.util.Map;

public class MainGradle {
    public static void main(String[] args) {
        // Word count example
        Map<String, Integer> wordCount = new HashMap<>();
        String sentence = "Gradle build tool makes Java powerful and flexible";
        for (String word : sentence.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        wordCount.forEach((k, v) -> System.out.println(k + " : " + v));

        // AdvancedMath examples
        AdvancedMath math = new AdvancedMath();
        System.out.println("GCD of 56 and 98: " + math.gcd(56, 98));
        System.out.println("Is 29 prime? " + math.isPrime(29));
    }
}

class AdvancedMath {
    // Calculate GCD using recursion
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Check if a number is prime
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
