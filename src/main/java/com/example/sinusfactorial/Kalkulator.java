package com.example.sinusfactorial;

public class Kalkulator {
    public static double calculateSin(double number) {
        return Math.sin(number);
    }

    public static long calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}
