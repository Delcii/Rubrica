package Rubrica.Salvataggio;
import Rubrica.Contatto;

import java.io.*;
import java.util.Objects;

public class SalvaCarica {

    public SalvaCarica() {

    }

    /**
     * Metodo per il salvataggio delle informazioni su file,
     * salva ogni parametro su una riga diversa del file
     * @return void
     */
    public static void salva(Contatto[] rubrica) throws IOException {
        try (BufferedWriter salva = new BufferedWriter(new FileWriter("Rubrica.txt"))) {
            for (int i = 0; i < rubrica.length; i++) {
                if(rubrica[i] == null)  break;
                if(rubrica[i].getCitta() == null && rubrica[i].getIndirizzo() == null && rubrica[i].getCap() == null)
                    salva.write("N");
                if(rubrica[i].getCitta() != null)
                    salva.write("C");
                if(rubrica[i].getIndirizzo() != null)
                {
                    if(rubrica[i].getCitta() != null)   salva.write("-");
                    salva.write("I");
                }
                if(rubrica[i].getCap() != null)
                {
                    if(rubrica[i].getIndirizzo() != null || rubrica[i].getCitta() != null)   salva.write("-");
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
                if(rubrica[i].getCitta() != null)  {
                    salva.write(rubrica[i].getCitta());
                    salva.newLine();
                }
                if(rubrica[i].getIndirizzo() != null) {
                    salva.write(rubrica[i].getIndirizzo());
                    salva.newLine();
                }
                if(rubrica[i].getCap() != null) {
                    salva.write(rubrica[i].getCap().toString());
                    salva.newLine();
                }
            }
            salva.flush();
        }
    }


    public static Contatto[] carica(Contatto[] rubrica) throws IOException {
        try (BufferedReader carica = new BufferedReader(new FileReader("Rubrica.txt"))) {
            String variabile = carica.readLine();

            for(int k=0; variabile != null; k++)
            {
                Contatto tmp = new Contatto();
                String buffer[] = variabile.split("-");
                tmp.setNome(carica.readLine());
                tmp.setCognome(carica.readLine());
                tmp.setNumero(Integer.parseInt(carica.readLine()));
                tmp.setIndirizzoMail(carica.readLine());
                for(int i=0;i< buffer.length;i++) {
                    if (Objects.equals(buffer[i], "C")) tmp.setCitta(carica.readLine());
                    else
                    if (Objects.equals(buffer[i], "I")) tmp.setIndirizzo(carica.readLine());
                    else
                    if (Objects.equals(buffer[i], "A")) tmp.setCap(Integer.parseInt(carica.readLine()));
                    else
                    if (Objects.equals(buffer[i], "N")) break;
                    else
                        System.out.println("Errore");
                }
                variabile= carica.readLine();
                rubrica[k] = tmp;
            }
            return rubrica;
        }
    }
}
