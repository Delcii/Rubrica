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
     * salva ogni parametro su una riga diversa del file
     * @return void
     */
    public void salva() throws IOException {
        try (BufferedWriter salva = new BufferedWriter(new FileWriter("Rubrica.txt"))) {
            for (int i = 0; i < rubrica.length; i++) {
                if(rubrica[i].getCitta() == null && rubrica[i].getIndirizzo() == null && rubrica[i].getCap() == null)
                    salva.write("N");
                if(rubrica[i].getCitta() != null)
                    salva.write("C-");
                if(rubrica[i].getIndirizzo() != null)
                    salva.write("I-");
                if(rubrica[i].getCap() != null)
                    salva.write("A");
                salva.newLine();
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
