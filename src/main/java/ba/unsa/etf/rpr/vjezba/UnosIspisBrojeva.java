package ba.unsa.etf.rpr.vjezba;
import java.util.Scanner;

public class  UnosIspisBrojeva{
    public static void main(String[] args) {
        // Kreiranje objekta Scanner za unos s konzole
        Scanner scanner = new Scanner(System.in);

        // Unos prvog broja
        System.out.print("Unesite prvi cijeli broj: ");
        int prviBroj = scanner.nextInt();

        // Unos drugog broja
        System.out.print("Unesite drugi cijeli broj: ");
        int drugiBroj = scanner.nextInt();

        // Zatvaranje Scanner objekta nakon upotrebe
        scanner.close();

        // Ispisivanje unesenih brojeva
        System.out.println("Prvi broj: " + prviBroj);
        System.out.println("Drugi broj: " + drugiBroj);
    }
}
