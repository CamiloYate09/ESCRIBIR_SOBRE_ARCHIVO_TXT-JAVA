package escribirtexto;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscribirTexto {

    public static void main(String[] args) {

        FileWriter escribir = null;
        PrintWriter salida = null;

        try {
            Scanner entrada = new Scanner(System.in);
            escribir = new FileWriter("Y:/escritos/datos.txt");
            salida = new PrintWriter(escribir);
            String cadena;
            System.out.println("Escribe lo que quieras y al terminar ponle FIN");
            cadena = entrada.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);
                cadena = entrada.nextLine();

            }
            salida.flush();
        } catch (Exception evento) {

            Logger.getLogger(EscribirTexto.class.getName()).log(Level.SEVERE, null, evento);

        } finally {
            salida.close();
        }

    }

}
