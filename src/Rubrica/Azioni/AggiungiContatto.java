package Rubrica.Azioni;
import Rubrica.Contatto;
import java.util.Objects;
import java.util.Scanner;

/**
 * Classe per l'aggiunta di un contatto.
 * Esiste per rendere il programma più leggibile.
 * @version 1.0 (13.01.23)
 * @author Calissi, Colombo, Del Cimmuto
 * @see Contatto
 */
public class AggiungiContatto {

    /**
     * Metodo per l'aggiunta di un contatto nella rubrica,
     * permette di aggiungere informazioni non strettamente necessarie.
     * @return Contatto
     */
    public static Contatto main() {

        Scanner input = new Scanner(System.in);
        Contatto tmp = new Contatto();

        System.out.println("\nNome Contatto: ");
        tmp.setNome(input.nextLine());
        System.out.println("\nCognome Contatto: ");
        tmp.setCognome(input.nextLine());
        System.out.println("\nNumero di telefono: ");
        while(true){
            try {
                tmp.setNumero(Integer.parseInt(input.nextLine()));
                break;
            } catch(Exception NumberFormatException) {
                System.out.println("Inserire un numero.");
            }
        }
        System.out.println("\nIndirizzo mail: ");
        tmp.setIndirizzoMail(input.nextLine());

        System.out.println("\naggiungere altre informazioni? (si/no): ");
        if (Objects.equals(input.nextLine(), "si")) {

            System.out.println("Aggiungere domicilio? (si/no): ");
            if (Objects.equals(input.nextLine(), "si")) {
                System.out.println("Domicilio: ");
                tmp.setIndirizzo(input.nextLine());
            }

            System.out.println("Aggiungere città? (si/no): ");
            if (Objects.equals(input.nextLine(), "si")) {
                System.out.println("Città: ");
                tmp.setCitta(input.nextLine());
            }

            System.out.println("Aggiungere CAP? (si/no): ");
            if (Objects.equals(input.nextLine(), "si")) {
                System.out.println("CAP: ");
                while (true) {
                    try {
                        tmp.setCap(Integer.parseInt(input.nextLine()));
                        break;
                    } catch (Exception NumberFormatException) {
                        System.out.println("Inserire un numero.");
                    }
                }
            }
        }
        return tmp;
    }


}
