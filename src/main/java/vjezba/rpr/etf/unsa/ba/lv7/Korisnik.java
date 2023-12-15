package vjezba.rpr.etf.unsa.ba.lv7;

import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class Korisnik {
    private final StringProperty ime = new SimpleStringProperty();
    private final StringProperty prezime = new SimpleStringProperty();
    private final StringProperty email = new SimpleStringProperty();
    private final StringProperty korisnickoIme = new SimpleStringProperty();
    private final StringProperty lozinka = new SimpleStringProperty();

    // Default constructor
    public Korisnik() {
        // You can initialize default values or perform other setup here if needed
    }

    // Getter and setter methods for ime
    public String getIme() {
        return ime.get();
    }

    public void setIme(String value) {
        ime.set(value);
    }

    public StringProperty imeProperty() {
        return ime;
    }

    // Getter and setter methods for prezime
    public String getPrezime() {
        return prezime.get();
    }

    public void setPrezime(String value) {
        prezime.set(value);
    }

    public StringProperty prezimeProperty() {
        return prezime;
    }

    // Getter and setter methods for email
    public String getEmail() {
        return email.get();
    }

    public void setEmail(String value) {
        email.set(value);
    }

    public StringProperty emailProperty() {
        return email;
    }

    // Getter and setter methods for korisnickoIme
    public String getKorisnickoIme() {
        return korisnickoIme.get();
    }

    public void setKorisnickoIme(String value) {
        korisnickoIme.set(value);
    }

    public StringProperty korisnickoImeProperty() {
        return korisnickoIme;
    }

    // Getter and setter methods for lozinka
    public String getLozinka() {
        return lozinka.get();
    }

    public void setLozinka(String value) {
        lozinka.set(value);
    }

    public StringProperty lozinkaProperty() {
        return lozinka;
    }
}


