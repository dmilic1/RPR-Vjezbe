package ba.unsa.etf.rpr.vjezba;

class Student extends LicneInformacije{
    private String godinaStudija;
    private String indeks;
    public String getGodinaStudija(){
        return godinaStudija;
    }
    public void setGodinaStudija(String godina){
        this.godinaStudija = godina;
    }

    public String getIndeks(){
        return indeks;
    }

    public void setIndeks(String i){
        this.indeks = i;
    }
}
