package Rubrica.Azioni;
import Rubrica.Contatto;

import java.util.List;

/**
 * Classe per la stampa della rubrica.
 * Esiste per rendere il programma più leggibile.
 * @version 1.0 (13.01.23)
 * @author Calissi, Colombo, Del Cimmuto
 * @see Contatto
 */
public class VisualizzaRubrica {

    /**
     * Metodo per la stampa della rubrica.
     * @param rubrica   lista di contatti
     * @return void
     */
    public static void main(List<Contatto> rubrica) {
        for(int i=0; i< rubrica.size(); i++)
            if(rubrica.get(i) != null){
                System.out.println("\n\nContatto " + i + "\n" + rubrica.get(i).toString());
            }

        System.out.print("\n\nPremi invio per continuare... ");
        try{
            System.in.read();
        } catch (Exception IOException) {
            System.out.println("Errore.");
        }
    }
}
