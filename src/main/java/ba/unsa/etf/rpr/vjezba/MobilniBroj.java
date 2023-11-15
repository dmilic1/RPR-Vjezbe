package ba.unsa.etf.rpr.vjezba;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
        // Implementirajte hashCode po potrebi
        return broj.hashCode();
    }
}
