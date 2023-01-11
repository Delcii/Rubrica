package Rubrica.Salvataggio;
import Rubrica.Contatto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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


    public static void carica(Contatto[] rubrica) throws IOException{

    }
}
