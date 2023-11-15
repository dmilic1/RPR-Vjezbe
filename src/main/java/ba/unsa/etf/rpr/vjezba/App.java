package ba.unsa.etf.rpr.vjezba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Double> brojevi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Unesite broj (ili 'stop' za kraj unosa): ");
            String unos = scanner.nextLine();

            if (unos.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                double broj = Double.parseDouble(unos);
                brojevi.add(broj);
            } catch (NumberFormatException e) {
                System.out.println("Neispravan unos. Unesite ponovno.");
            }
        }

        scanner.close();

        if (!brojevi.isEmpty()) {
            double min = brojevi.stream().min(Double::compare).orElse(Double.NaN);
            double max = brojevi.stream().max(Double::compare).orElse(Double.NaN);
            double mean = brojevi.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
            double sumSquareDiff = brojevi.stream().mapToDouble(b -> Math.pow(b - mean, 2)).sum();
            double standardDeviation = Math.sqrt(sumSquareDiff / brojevi.size());

            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            System.out.println("Mean: " + mean);
            System.out.println("Standard Deviation: " + standardDeviation);
        } else {
            System.out.println("Lista je prazna. Nema podataka za izračunavanje.");
        }
    }
}
