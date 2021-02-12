package co.sofka;

import co.sofka.electrodomesticos.Electrodomestico;
import co.sofka.productos.Nevera;
import co.sofka.productos.Otros;
import co.sofka.productos.Televisor;

import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        // Creando objeto Televisor
        Electrodomestico plasma = new Televisor("A", "Nacional", 48, true);

        //Creando objeto nevera
        Electrodomestico nevecom = new Nevera("A", "Nacional", 140);

        // Creando objeto Televisor
        Electrodomestico led = new Televisor("A", "Nacional", 48, true);

        // Creando objeto Otros
        Electrodomestico licuadora = new Otros("A", "Importado");

        //Lista de objetos Electrodomestico
        ArrayList <Electrodomestico> electrodomesticos = new ArrayList <> ();
        electrodomesticos.add(plasma);
        electrodomesticos.add(nevecom);
        electrodomesticos.add(led);
        electrodomesticos.add(licuadora);

        int total = 0;
        for (Electrodomestico i: electrodomesticos) {
            if (i instanceof Televisor) {
                total = total + ((Televisor) i).getValorTotalTelevision();
            }
        }
        System.out.println("****************************************************************");
        System.out.println("                El gran SAM                      ");
        System.out.println(new Date());
        System.out.println("El precio total de los televisores es de:           " + total);

        total = 0;
        for (Electrodomestico i: electrodomesticos) {
            if (i instanceof Nevera) {
                total = total + ((Nevera) i).getValorTotalNevera();
            }
        }
        System.out.println("El precio total de las neveras es de:               " + total);

        total = 0;
        for (Electrodomestico i: electrodomesticos) {
            if (i instanceof Otros) {
                total = total + ((Otros) i).getValorTotalOtro();
            }
        }
        System.out.println("El precio total de otros electrodomesticos es de:   " + total);
        System.out.println("El numero total de electrodomestico fue de:         " + electrodomesticos.size());
        System.out.println("***************************************************************");
    }
}
