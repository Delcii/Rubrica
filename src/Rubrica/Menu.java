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
            selezione = Integer.parseInt(input.nextLine());
            switch (selezione) {
                case 1:
                    for(int i=0; i< rubrica.length; i++)
                        if(rubrica[i] == null)
                        {
                            Contatto tmp = new Contatto();
                            System.out.println("\nNome Contatto: ");
                            tmp.setNome(input.nextLine());
                            System.out.println("\nCognome Contatto: ");
                            tmp.setCognome(input.nextLine());
                            System.out.println("\nNumero di telefono: ");
                            tmp.setNumero(Integer.parseInt(input.nextLine()));
                            System.out.println("\nIndirizzo mail: ");
                            tmp.setIndirizzoMail(input.nextLine());
                            rubrica[i] = tmp;
                            break;
                        }
                    break;
                case 2: break;
                case 3:
                    for(int i=0; i< rubrica.length; i++)
                        if(rubrica[i] != null){
                            System.out.println("\n\nContatto " + i+1 + "\n" + rubrica[i].toString());
                            input.nextLine();}
                    break;
                case 4: break;
                case 5: break;
            }
            }
        }
    }

