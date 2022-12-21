public class Contatto {
    String nome,cognome;
    int fisso,cellulare;
    Indirizzo indirrizo;

    public Contatto(String nome, int fisso, int cellulare, Indirizzo indirrizo) {
        this.nome = nome;
        this.fisso = fisso;
        this.cellulare = cellulare;
        this.indirrizo = indirrizo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFisso() {
        return fisso;
    }

    public void setFisso(int fisso) {
        this.fisso = fisso;
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
