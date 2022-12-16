package Rubrica.Azioni;

import Rubrica.Contatto;

import java.util.Scanner;

public class ModificaContatto {
    public static Contatto main(Contatto tmp)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Cosa modificare?\n\n [1] Nome\n [2] Cognome\n [3] Numero di telefono\n [4] Indirizzo mail\n [5] Domicilio\n [6] Città\n [7] CAP");
        int selezione = Integer.parseInt(input.nextLine());
        switch (selezione)
        {
            case 1:
                System.out.println("Nuovo nome: ");
                tmp.setNome(input.nextLine());
                break;

            case 2:
                System.out.println("Nuovo cognome: ");
                tmp.setCognome(input.nextLine());
                break;

            case 3:
                System.out.println("Nuovo numero: ");
                tmp.setNumero(Integer.parseInt(input.nextLine()));
                break;

            case 4:
                System.out.println("Nuova mail: ");
                tmp.setIndirizzoMail(input.nextLine());
                break;

            case 5:
                System.out.println("Nuovo domicilio: ");
                tmp.setIndirizzo(input.nextLine());
                break;

            case 6:
                System.out.println("Nuova città: ");
                tmp.setCitta(input.nextLine());
                break;

            case 7:
                System.out.println("Nuovo CAP: ");
                tmp.setCap(Integer.parseInt(input.nextLine()));
                break;

        }
        return tmp;
    }
}
