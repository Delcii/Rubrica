package Rubrica.Salvataggio;
import Rubrica.Contatto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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
     * @param rubrica una lista di contatti, rappresentante la rubrica
     * @return void
     */
    public static void salva(List<Contatto> rubrica) {
        try {
            BufferedWriter salva = new BufferedWriter(new FileWriter("Rubrica.txt"));
            for (int i = 0; i < rubrica.size(); i++) {
                if (rubrica.get(i) == null) break;
                if (rubrica.get(i).getCitta() == null && rubrica.get(i).getIndirizzo() == null && rubrica.get(i).getCap() == null)
                    salva.write("N");
                if (rubrica.get(i).getCitta() != null)
                    salva.write("C");
                if (rubrica.get(i).getIndirizzo() != null) {
                    if (rubrica.get(i).getCitta() != null) salva.write("-");
                    salva.write("I");
                }
                if (rubrica.get(i).getCap() != null) {
                    if (rubrica.get(i).getIndirizzo() != null || rubrica.get(i).getCitta() != null) salva.write("-");
                    salva.write("A");
                }
                salva.newLine();
                salva.write(rubrica.get(i).getNome());
                salva.newLine();
                salva.write(rubrica.get(i).getCognome());
                salva.newLine();
                salva.write(rubrica.get(i).getNumero().toString());
                salva.newLine();
                salva.write(rubrica.get(i).getIndirizzoMail());
                salva.newLine();
                if (rubrica.get(i).getCitta() != null) {
                    salva.write(rubrica.get(i).getCitta());
                    salva.newLine();
                }
                if (rubrica.get(i).getIndirizzo() != null) {
                    salva.write(rubrica.get(i).getIndirizzo());
                    salva.newLine();
                }
                if (rubrica.get(i).getCap() != null) {
                    salva.write(rubrica.get(i).getCap().toString());
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
     * @return List Contatto       lista rappresentante la rubrica
     */

    public static List<Contatto> carica() {
        try {
            List<Contatto> rubrica = new ArrayList<>();
            BufferedReader carica = new BufferedReader(new FileReader("Rubrica.txt"));
            String variabile = carica.readLine();

            while(variabile != null) {
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
                rubrica.add(tmp);
            }
            return rubrica;
        } catch (Exception IOException) {
            System.out.println("file \"rubrica.txt\" non trovato o permessi mancanti.");
            return new ArrayList<>();
        }
    }


}

