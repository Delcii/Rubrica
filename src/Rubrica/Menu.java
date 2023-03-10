package Rubrica;

import Rubrica.Azioni.*;
import Rubrica.Salvataggio.SalvaCarica;
import Rubrica.Azioni.AggiungiContatto;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Il vero main del programma :)
 * @version 1.0 (13.01.23)
 * @author Calissi, Colombo, Del Cimmuto
 * @see AggiungiContatto
 * @see EliminaContatto
 * @see ModificaContatto
 * @see VisualizzaRubrica
 * @see SalvaCarica
 * @see Contatto
 */
public class Menu {

    /**
     * Metodo che rappresenta il menu del programma.
     * @return void
     */
    public static void main() {
        int selezione;
        String buffer;
        List<Contatto> rubrica = new ArrayList<>(0);
        Scanner input = new Scanner(System.in);
        if(new File("Rubrica.txt").isFile())
        {
            System.out.print("Rubrica già salvata trovata. Caricare? (si/no): ");
            if(Objects.equals(input.nextLine(), "si"))   rubrica = SalvaCarica.carica();
        }
        while (true){
            System.out.println("\n\tRUBRICA\n\n [1] Aggiungi Contatto\n [2] Modifica Contatto\n [3] Elimina Contatto\n [4] Visualizza Rubrica\n [5] Salva su File\n [6] Importa da File\n\t");
            while(true){
                try{
                    selezione = Integer.parseInt(input.nextLine());
                    break;
                } catch (Exception NumberFormatException) {
                    System.out.println("Inserire un numero tra 1 e 6.");
                }
            }

            switch (selezione) {
                case 1 -> // aggiungere un contatto
                        rubrica.add(AggiungiContatto.main());
                case 2 -> {         // modifica un contatto
                    boolean ricerca = true;
                    System.out.print("\nNome contatto da modificare: ");
                    buffer = input.nextLine();
                    for (int i = 0; i < rubrica.size(); i++)
                        if (Objects.equals(rubrica.get(i).getNome(), buffer)) {
                            rubrica.set(i, ModificaContatto.main(rubrica.get(i)));
                            ricerca = false;
                            break;
                        }
                    if (ricerca) System.out.println("Contatto non trovato.");
                }
                case 3 ->     // eliminare un conttatto
                        rubrica = EliminaContatto.main(rubrica);
                case 4 ->         // visualizza rubrica
                        VisualizzaRubrica.main(rubrica);
                case 5 ->     // salva su file
                        SalvaCarica.salva(rubrica);
                case 6 ->     // carica da file
                        rubrica = SalvaCarica.carica();
                default -> System.out.println("\nScelta errata.\n");
            }
            }
        }
    }

