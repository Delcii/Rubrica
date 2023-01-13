package Rubrica.Azioni;
import Rubrica.Contatto;
import java.util.Objects;
import java.util.Scanner;

/**
 * Classe per rimuovere un contatto.
 * Esiste per rendere il programma più leggibile.
 * @version 1.0 (13.01.23)
 * @author Calissi, Colombo, Del Cimmuto
 * @see Contatto
 */
public class EliminaContatto {

    /**
     * Metodo per rimuovere un contatto dalla rubrica dato il nome,
     * sposta poi gli altri contatti per evitare frammentazione nell'array.
     * @param rubrica array di contatti, rappresentante la rubrica
     * @return Contatto[] array rappresentante la rubrica
     */
    public static Contatto[] main(Contatto[] rubrica){
        System.out.print("\nNome contatto da eliminare: ");
        String buffer = new Scanner(System.in).nextLine();
        for(int i =0; i< rubrica.length; i++)
            if(rubrica[i] != null && Objects.equals(rubrica[i].getNome(), buffer))
            {
                rubrica[i] = null;
                for(; i<rubrica.length; i++)        // funziona pls ti voglio bene
                    if(rubrica[i] != null )
                    {
                        rubrica[i-1] = rubrica[i];
                        rubrica[i] = null;
                    }
                return rubrica;
            }
        System.out.println("Contatto non trovato.");
        return rubrica;
    }
}
