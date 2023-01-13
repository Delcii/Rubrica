package Rubrica.Azioni;
import Rubrica.Contatto;

import java.util.Scanner;

/**
 * Classe per la modifica di un contatto.
 * Esiste per rendere il programma più leggibile.
 * @version 1.0 (13.01.23)
 * @author Calissi, Colombo, Del Cimmuto
 * @see Contatto
 */
public class ModificaContatto {

    /**
     * Metodo per la modifica di un contatto,
     * presenta all'utente un menù di scelta.
     * @param contatto contatto da modificare
     * @return Contatto
     */
    public static Contatto main(Contatto contatto)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Cosa modificare?\n\n [1] Nome\n [2] Cognome\n [3] Numero di telefono\n [4] Indirizzo mail\n [5] Domicilio\n [6] Città\n [7] CAP");
        int selezione = Integer.parseInt(input.nextLine());
        switch (selezione)
        {
            case 1:
                System.out.println("Nuovo nome: ");
                contatto.setNome(input.nextLine());
                break;

            case 2:
                System.out.println("Nuovo cognome: ");
                contatto.setCognome(input.nextLine());
                break;

            case 3:
                System.out.println("Nuovo numero: ");
                contatto.setNumero(Integer.parseInt(input.nextLine()));
                break;

            case 4:
                System.out.println("Nuova mail: ");
                contatto.setIndirizzoMail(input.nextLine());
                break;

            case 5:
                System.out.println("Nuovo domicilio: ");
                contatto.setIndirizzo(input.nextLine());
                break;

            case 6:
                System.out.println("Nuova città: ");
                contatto.setCitta(input.nextLine());
                break;

            case 7:
                System.out.println("Nuovo CAP: ");
                contatto.setCap(Integer.parseInt(input.nextLine()));
                break;

        }
        return contatto;
    }
}
