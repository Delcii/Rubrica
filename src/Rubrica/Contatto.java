package Rubrica;
public class Contatto {
    String nome,cognome;
    int cellulare;
    Indirizzo indirrizo;

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Contatto(String nome, int fisso, int cellulare, Indirizzo indirrizo) {
        this.nome = nome;
        this.cellulare = cellulare;
        this.indirrizo = indirrizo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCellulare() {
        return cellulare;
    }

    public void setCellulare(int cellulare) {
        this.cellulare = cellulare;
    }

    public Indirizzo getIndirrizo() {
        return indirrizo;
    }

    public void setIndirrizo(Indirizzo indirrizo) {
        this.indirrizo = indirrizo;
    }

}
