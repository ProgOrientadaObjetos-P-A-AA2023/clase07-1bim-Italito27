package paquete5;

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor2;

/**
 *
 * @author Italo
 */
public class ManejoArrayList5 {

    public static void main(String[] args) {
        String[] lineas = {"Tara Hermandez|contratado|30",
            "Luis Andrade|factura|35", "Ana Juarez|nombramiento|40"};
        
        
        for (int i = 0; i< lineas.length; i++){
         String c = lineas[i];
                 
             String numCadena = "1";      
             int numEntero = Integer.parseInt(numCadena);
        }
        ArrayList<String> linea_partes = new ArrayList<>(
                Arrays.asList(lineas.split(";")) // ["Tara Hernandez", "contratado"]
        );
        Profesor2 p = new Profesor2(linea_partes.get(0), // Tara Hernandez
                linea_partes.get(1)); // contratado;

        System.out.println(p);

    }
}
