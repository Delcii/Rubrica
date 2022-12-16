package Rubrica.Azioni;

import Rubrica.Contatto;

import java.util.Objects;
import java.util.Scanner;

public class EliminaContatto {
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
                break;
            }
            else    System.out.println("Contatto non trovato.");
        return rubrica;
    }
}
