package Rubrica.Azioni;
import Rubrica.Contatto;

import java.util.List;
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
     * sposta poi gli altri contatti per evitare frammentazione della lista.
     * @param rubrica lista di contatti, rappresentante la rubrica
     * @return List contatto     lista rappresentante la rubrica
     */
    public static List<Contatto> main(List<Contatto> rubrica){
        System.out.print("\nNome contatto da eliminare: ");
        String buffer = new Scanner(System.in).nextLine();
        for(int i =0; i< rubrica.size(); i++)
            if(Objects.equals(rubrica.get(i).getNome(), buffer))
            {
                rubrica.set(i, null);
                for(; i<rubrica.size(); i++)        //funziona pls ti voglio bene
                    if(rubrica.get(i) != null )
                    {
                        rubrica.set(i - 1, rubrica.get(i));
                        rubrica.set(i, null);
                    }
                return rubrica;
            }
        System.out.println("Contatto non trovato.");
        return rubrica;
    }
}
