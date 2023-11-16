package ba.unsa.etf.rpr.vjezba;

public class Poruke {
    private String[] poruka;

    public String[] getPoruka(){
        return poruka;
    }
/*
  konstruktor koji prima
 listu klasa koje imaju metodu predstavi()
*/
public Poruke(Object[] objekti) {
    this.poruka = new String[objekti.length];

    for (int i = 0; i < objekti.length; i++) {
        if (objekti[i] instanceof LicneInformacije) {
            poruka[i] = ((LicneInformacije) objekti[i]).getIme() + " " + ((LicneInformacije) objekti[i]).getPrezime();
        } else if (objekti[i] instanceof Student) {
            poruka[i] = ((Student) objekti[i]).getIme() + " " + ((Student) objekti[i]).getPrezime() +
                    " - Godina studija: " + ((Student) objekti[i]).getGodinaStudija() +
                    ", Broj indexa: " + ((Student) objekti[i]).getIndeks();
        } else if (objekti[i] instanceof Nastavnik) {
            poruka[i] = ((Nastavnik) objekti[i]).getIme() + " " + ((Nastavnik) objekti[i]).getPrezime() +
                    " - Titula: " + ((Nastavnik) objekti[i]).getTitula();
        } else if (objekti[i] instanceof Predmet) {
            poruka[i] = "Predmet: " + ((Predmet) objekti[i]).getNaziv() +
                    ", Opis: " + ((Predmet) objekti[i]).getOpis();
        }
    }
}

}
