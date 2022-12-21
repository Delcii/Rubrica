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

    public void salva() throws IOException {
        try (BufferedWriter salva = new BufferedWriter(new FileWriter("Rubrica.txt"))) {
            for (int i = 0; i < rubrica.length; i++) {
                salva.write(rubrica[i].getNome());
                salva.newLine();
                salva.write(rubrica[i].getCognome());
                salva.newLine();
                salva.write(rubrica[i].getCellulare());
                salva.newLine();
                salva.write(rubrica[i].getIndirrizo().getCitta());
                salva.newLine();
                salva.write(rubrica[i].getIndirrizo().getVia());
                salva.newLine();
                salva.write(rubrica[i].getIndirrizo().getCivico());
                salva.newLine();
                salva.write(rubrica[i].getIndirrizo().getCap());
            }
            salva.flush();
        }
    }
    public void carica() throws IOException{

    }
}
