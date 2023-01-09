package Rubrica.Salvataggio;
import Rubrica.Contatto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SalvaCarica {
    Contatto[] rubrica;
    public SalvaCarica(Contatto[] r) {
        rubrica = r;
    }

    /**
     * Metodo per il salvataggio delle informazioni su file,
     * salva ogni parametro su una riga diversa del file.
     * @param nome descrizione
     * @param nome descrizione
     * @return descrizione
     */
    public void salva() throws IOException {
        try (BufferedWriter salva = new BufferedWriter(new FileWriter("Rubrica.txt"))) {
            for (int i = 0; i < rubrica.length; i++) {
                salva.write(rubrica[i].getNome());
                salva.newLine();
                salva.write(rubrica[i].getCognome());
                salva.newLine();
                salva.write(rubrica[i].getNumero());
                salva.newLine();
                salva.write(rubrica[i].getIndirizzoMail());
            }
            salva.flush();
        }
    }


    public void carica() throws IOException{

    }
}
