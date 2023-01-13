package Rubrica.Salvataggio;
import Rubrica.Contatto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Classe per il salvataggio e il caricamento
 * della rubrica da file.
 * Ora con la serializzazione!
 * @version 2.0 (13.01.23)
 * @author Calissi, Colombo, Del Cimmuto
 * @see Contatto
 */
public class SalvaCarica {


    /**
     * Metodo per il salvataggio delle informazioni su file,
     * usando la serializzazione
     * @param rubrica una lista di contatti, rappresentante la rubrica
     * @return void
     */
    public static void salva(List<Contatto> rubrica) {
        try {
            ObjectOutputStream salva = new ObjectOutputStream(new FileOutputStream("Rubrica.txt"));
            salva.writeObject(rubrica);
            salva.flush();
            salva.close();
        } catch (Exception IOException) {
            System.out.println("Errore nel generare il file \"rubrica.txt\"");
        }
    }


    /**
     * Metodo per caricare la rubrica da un file,
     * tramite la serializzazione
     * @return List Contatto       lista rappresentante la rubrica
     */

    public static List<Contatto> carica() {
        try {
            ObjectInputStream carica = new ObjectInputStream(new FileInputStream("Rubrica.txt"));
            return (List<Contatto>) carica.readObject();
        } catch (Exception IOException) {
            System.out.println("file \"rubrica.txt\" non trovato o permessi mancanti.");
            return new ArrayList<>();
        }
    }


}

