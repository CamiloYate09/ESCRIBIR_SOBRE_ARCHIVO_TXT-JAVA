package escribirtexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoTexto {

    public static void main(String[] args) {
        FileReader lectura = null;

        try {
            lectura = new FileReader("Y:/escritos/datos.txt");
            BufferedReader entrada = new BufferedReader(lectura);
            String cadena = entrada.readLine();
            while (cadena != null) {
                System.out.println(cadena);
                cadena = entrada.readLine();

            }
        } catch (FileNotFoundException evento) {
            System.out.println(evento.getMessage());

        } catch (IOException evento2) {
            System.out.println(evento2.getMessage());
        } finally {

            try {
                if (lectura != null) {
                    lectura.close();

                }
            } catch (IOException evento3) {
                System.out.println(evento3.getMessage());

            }

        }
    }

}
