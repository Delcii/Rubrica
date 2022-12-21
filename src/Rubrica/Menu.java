package Rubrica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public Menu() {
    }
    public void start() throws InputMismatchException {
        int selezione;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("\n\tRUBRICA\n\n [1] Aggiungi Contatto\n [2] Modifica Contatto\n [3] Visualizza Rubrica\n [4] Salva su File\n [5] Importa da File\n\n\t");
            selezione = input.nextInt();
            switch (selezione) {
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
            }
            }
        }
    }
}
