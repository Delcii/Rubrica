package Rubrica;

import Rubrica.Azioni.*;
import Rubrica.Salvataggio.SalvaCarica;
import Rubrica.Azioni.AggiungiContatto;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    static Contatto[] rubrica = new Contatto[100];

    public static void main() throws InputMismatchException, IOException {
        int selezione;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("\n\tRUBRICA\n\n [1] Aggiungi Contatto\n [2] Modifica Contatto\n [3] Visualizza Rubrica\n [4] Salva su File\n [5] Importa da File\n\n\t");
            selezione = Integer.parseInt(input.nextLine());
            switch (selezione) {
                case 1:                     // aggiungere contatto
                    for(int i=0; i< rubrica.length; i++)
                        if(rubrica[i] == null) {
                            rubrica[i] = AggiungiContatto.main();
                            break;
                        }
                    break;

                case 2:         // modifica contatto
                    System.out.print("\nNome contatto da modificare: ");
                        for(int i =0; i< rubrica.length; i++)
                            if(rubrica[i] != null && Objects.equals(rubrica[i].getNome(), input.nextLine()))
                            {
                                rubrica[i] = ModificaContatto.main(rubrica[i]);
                                break;
                            }
                            else System.out.println("Contatto non trovato.");
                    break;

                case 3:         // visualizza rubrica
                    VisualizzaRubrica.main(rubrica);
                    break;

                case 4:     // salva su file
                    SalvaCarica.salva(rubrica);
                    break;

                case 5:     // carica da file
                    SalvaCarica.carica(rubrica);
                    break;
            }
            }
        }
    }

