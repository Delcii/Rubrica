package Rubrica.Azioni;

import Rubrica.Contatto;

import java.io.IOException;

public class VisualizzaRubrica {
    public static void main(Contatto[] rubrica) throws IOException {
        for(int i=0; i< rubrica.length; i++)

            if(rubrica[i] != null){
                System.out.println("\n\nContatto " + i + "\n" + rubrica[i].toString());
            }

        System.out.print("\n\nPremi invio per continuare... ");
        System.in.read();
    }
}
