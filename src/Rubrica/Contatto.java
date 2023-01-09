package Rubrica;
public class Contatto {
    String cognome,nome,indirizzoMail;
    int numero;

    public Contatto() {}
    public Contatto(String cognome, String nome, String indirizzoMail, int numero) {
        this.cognome = cognome;
        this.nome = nome;
        this.indirizzoMail = indirizzoMail;
        this.numero = numero;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzoMail() {
        return indirizzoMail;
    }

    public void setIndirizzoMail(String indirizzoMail) {
        this.indirizzoMail = indirizzoMail;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString()
    {
        String stringa = "\nNome: " + getNome() + "\nCognome " + getCognome() + "\nNumero telefonico: " + getNumero() + "\nIndirizzo mail: " + getIndirizzoMail();
        return stringa;
    }
}
