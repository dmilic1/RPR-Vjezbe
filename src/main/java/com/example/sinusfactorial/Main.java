package com.example.sinusfactorial;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Unesite broj za izračunavanje sinusa i faktorijela.");
            return;
        }

        double number = Double.parseDouble(args[0]);

        double sinResult = Kalkulator.calculateSin(number);
        long factorialResult = Kalkulator.calculateFactorial((int) number);

        System.out.println("Sin(" + number + ") = " + sinResult);
        System.out.println(number + "! = " + factorialResult);
    }
}

