package Rubrica;

import java.io.Serializable;

/**
 * Classe che definisce un contatto.
 * @version 1.0 (13.01.23)
 * @author Calissi, Colombo, Del Cimmuto
 */
public class Contatto implements Serializable {
    String cognome,nome,indirizzoMail,indirizzo,citta;
    Integer numero,cap;

    public Contatto() {}

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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public Integer getCap() {
        return cap;
    }


    public void setCap(int cap) {
        this.cap = cap;
    }

    /**
     * Ritorna una stringa che contiene le informazioni del contatto.
     * @return String
     */
    @Override
    public String toString()
    {
        String stringa = "\nNome: " + getNome() + "\nCognome: " + getCognome() + "\nNumero telefonico: " + getNumero() + "\nIndirizzo mail: " + getIndirizzoMail();
        if(indirizzo != null) stringa = stringa + "\nIndirizzo: " + getIndirizzo();
        if(citta != null)   stringa = stringa + "\ncittà: " + getCitta();
        if(cap != null)   stringa = stringa + "\nCAP: " + getCap();
        return stringa;
    }
}
