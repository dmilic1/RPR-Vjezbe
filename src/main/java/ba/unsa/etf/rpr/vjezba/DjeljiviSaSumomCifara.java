package ba.unsa.etf.rpr.vjezba;

import java.util.Scanner;

public class DjeljiviSaSumomCifara {

    // Funkcija koja računa sumu cifara broja
    public static int sumaCifara(int broj) {
        int suma = 0;

        while (broj != 0) {
            suma += broj % 10;
            broj /= 10;
        }

        return suma;
    }

    public static void main(String[] args) {
        // Unos broja n sa tastature
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = scanner.nextInt();

        // Ispisivanje brojeva koji su djeljivi sa sumom svojih cifara
        System.out.println("Brojevi između 1 i " + n + " koji su djeljivi sa sumom svojih cifara:");
        for (int i = 1; i <= n; i++) {
            int suma = sumaCifara(i);
            if (i % suma == 0) {
                System.out.println(i);
            }
        }

        // Zatvaranje Scanner objekta nakon upotrebe
        scanner.close();
    }
}

