package Rubrica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Contatto[] rubrica;
    public Menu(int r) {
        rubrica = new Contatto[r];
    }
    public void start() throws InputMismatchException {
        int selezione;
        String buffer;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("\n\tRUBRICA\n\n [1] Aggiungi Contatto\n [2] Modifica Contatto\n [3] Visualizza Rubrica\n [4] Salva su File\n [5] Importa da File\n\n\t");
            selezione = input.nextInt();
            switch (selezione) {
                case 1:
                    for(int i=0; i< rubrica.length; i++)
                        if(rubrica[i] == null)
                        {
                            System.out.println("\nNome Contatto: ");
                            rubrica[i].setNome(input.nextLine());
                            System.out.println("\nCognome Contatto: ");
                            rubrica[i].setCognome(input.nextLine());
                            System.out.println("\nNumero di telefono: ");
                            rubrica[i].setCellulare(input.nextInt());
                            System.out.println("\nIndirizzo: ");
                            rubrica[i].setNome(input.nextLine());
                        }
                    break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
            }
            }
        }
    }

