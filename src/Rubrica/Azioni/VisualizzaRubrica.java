package Rubrica.Azioni;
import Rubrica.Contatto;

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
     * @param rubrica   array di contatti
     * @return void
     */
    public static void main(Contatto[] rubrica) {
        for(int i=0; i< rubrica.length; i++)
            if(rubrica[i] != null){
                System.out.println("\n\nContatto " + i + "\n" + rubrica[i].toString());
            }

        System.out.print("\n\nPremi invio per continuare... ");
        try{
            System.in.read();
        } catch (Exception IOException) {
            System.out.println("Errore.");
        }
    }
}
