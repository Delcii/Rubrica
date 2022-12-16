public class Indirizzo {
    String citta,via;
    int cap,civico;

    public Indirizzo(String citta, String via, int cap, int civico) {
        this.citta = citta;
        this.via = via;
        this.cap = cap;
        this.civico = civico;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public int getCivico() {
        return civico;
    }

    public void setCivico(int civico) {
        this.civico = civico;
    }

}
