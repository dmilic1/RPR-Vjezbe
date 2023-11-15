package ba.unsa.etf.rpr.vjezba;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return grad + "/" + broj;
    }

    @Override
    public int hashCode() {
        // Implementirajte hashCode po potrebi
        return broj.hashCode();
    }
}