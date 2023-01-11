package Rubrica.Azioni;

import Rubrica.Contatto;
import java.util.Objects;
import java.util.Scanner;

public class AggiungiContatto {
    public static Contatto main() {

        Scanner input = new Scanner(System.in);
        Contatto tmp = new Contatto();

        System.out.println("\nNome Contatto: ");
        tmp.setNome(input.nextLine());
        System.out.println("\nCognome Contatto: ");
        tmp.setCognome(input.nextLine());
        System.out.println("\nNumero di telefono: ");
        tmp.setNumero(Integer.parseInt(input.nextLine()));
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
                tmp.setCap(Integer.parseInt(input.nextLine()));
            }
        }
        return tmp;
    }


}
