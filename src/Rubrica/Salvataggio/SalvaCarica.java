package Rubrica.Salvataggio;
import Rubrica.Contatto;

import java.io.*;
import java.util.Objects;

/**
 * Classe per il salvataggio e il caricamento
 * della rubrica da file.
 * @version 1.0 (13.01.23)
 * @author Calissi, Colombo, Del Cimmuto
 * @see Contatto
 */
public class SalvaCarica {


    /**
     * Metodo per il salvataggio delle informazioni su file,
     * salva ogni parametro su una riga diversa del file
     * la prima riga viene usata per notare la presenza di informazioni non necessarie.
     *
     * @param rubrica un array di contatti, rappresentante la rubrica
     * @return void
     */
    public static void salva(Contatto[] rubrica) {
        try {
            BufferedWriter salva = new BufferedWriter(new FileWriter("Rubrica.txt"));
            for (int i = 0; i < rubrica.length; i++) {
                if (rubrica[i] == null) break;
                if (rubrica[i].getCitta() == null && rubrica[i].getIndirizzo() == null && rubrica[i].getCap() == null)
                    salva.write("N");
                if (rubrica[i].getCitta() != null)
                    salva.write("C");
                if (rubrica[i].getIndirizzo() != null) {
                    if (rubrica[i].getCitta() != null) salva.write("-");
                    salva.write("I");
                }
                if (rubrica[i].getCap() != null) {
                    if (rubrica[i].getIndirizzo() != null || rubrica[i].getCitta() != null) salva.write("-");
                    salva.write("A");
                }
                salva.newLine();
                salva.write(rubrica[i].getNome());
                salva.newLine();
                salva.write(rubrica[i].getCognome());
                salva.newLine();
                salva.write(rubrica[i].getNumero().toString());
                salva.newLine();
                salva.write(rubrica[i].getIndirizzoMail());
                salva.newLine();
                if (rubrica[i].getCitta() != null) {
                    salva.write(rubrica[i].getCitta());
                    salva.newLine();
                }
                if (rubrica[i].getIndirizzo() != null) {
                    salva.write(rubrica[i].getIndirizzo());
                    salva.newLine();
                }
                if (rubrica[i].getCap() != null) {
                    salva.write(rubrica[i].getCap().toString());
                    salva.newLine();
                }
            }
            salva.flush();
        } catch (Exception IOException) {
            System.out.println("Errore nel generare il file \"rubrica.txt\"");
        }
    }


    /**
     * Metodo per caricare la rubrica da un file,
     * controlla che il file non sia danneggiato.
     * @param rubrica un array di contatti, rappresentante la rubrica
     * @return Contatto[] array rappresentante la rubrica
     */

    public static Contatto[] carica(Contatto[] rubrica) {
        try {
            BufferedReader carica = new BufferedReader(new FileReader("Rubrica.txt"));
            String variabile = carica.readLine();

            for (int k = 0; variabile != null; k++) {
                Contatto tmp = new Contatto();
                String buffer[] = variabile.split("-");
                tmp.setNome(carica.readLine());
                tmp.setCognome(carica.readLine());
                tmp.setNumero(Integer.parseInt(carica.readLine()));
                tmp.setIndirizzoMail(carica.readLine());
                for (int i = 0; i < buffer.length; i++) {
                    if (Objects.equals(buffer[i], "C")) tmp.setCitta(carica.readLine());
                    else if (Objects.equals(buffer[i], "I")) tmp.setIndirizzo(carica.readLine());
                    else if (Objects.equals(buffer[i], "A")) tmp.setCap(Integer.parseInt(carica.readLine()));
                    else if (Objects.equals(buffer[i], "N")) break;
                    else {
                        System.out.println("File corrotto.");
                        return null;
                    }
                }
                variabile = carica.readLine();
                rubrica[k] = tmp;
            }
            return rubrica;
        } catch (Exception IOException) {
            System.out.println("file \"rubrica.txt\" non trovato o permessi mancanti.");
            return rubrica;
        }
    }


}

