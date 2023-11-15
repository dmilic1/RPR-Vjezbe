package ba.unsa.etf.rpr.vjezba;

import java.util.*;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }

    public String dajBroj(String ime) {
        TelefonskiBroj broj = imenik.get(ime);
        return (broj != null) ? broj.ispisi() : "Nepostojeći kontakt";
    }

    public String dajIme(TelefonskiBroj broj) {
        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if (entry.getValue().equals(broj)) {
                return entry.getKey();
            }
        }
        return "Nepostojeći broj";
    }

    public String naSlovo(char s) {
        StringBuilder result = new StringBuilder();
        int counter = 1;

        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if (entry.getKey().charAt(0) == s) {
                result.append(counter).append(". ").append(entry.getKey()).append(" - ").append(entry.getValue().ispisi()).append("\n");
                counter++;
            }
        }

        return result.toString();
    }

    public Set<String> izGrada(Grad g) {
        Set<String> imena = new TreeSet<>();

        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if (entry.getValue() instanceof FiksniBroj) {
                FiksniBroj fiksniBroj = (FiksniBroj) entry.getValue();
                if (fiksniBroj.getGrad() == g) {
                    imena.add(entry.getKey());
                }
            }
        }

        return imena;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        Set<TelefonskiBroj> brojevi = new TreeSet<>(Comparator.comparing(TelefonskiBroj::ispisi));

        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if (entry.getValue() instanceof FiksniBroj) {
                FiksniBroj fiksniBroj = (FiksniBroj) entry.getValue();
                if (fiksniBroj.getGrad() == g) {
                    brojevi.add(entry.getValue());
                }
            }
        }

        return brojevi;
    }
}