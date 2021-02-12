package co.sofka.productos;

import co.sofka.electrodomesticos.Electrodomestico;

public class Nevera extends Electrodomestico {
    private int litros;
    private int valorTotalNevera;

    public Nevera(String consumo, String procedencia, int litros) {
        super(consumo, procedencia);
        this.litros = litros;
        CalcularprecioNevera();
    }

    public int getValorTotalNevera() {
        return valorTotalNevera;
    }

    public int CalcularprecioNevera() {
        if (litros > 120) {
            int porcentaje = (int) Math.floor( (getValorBase()) * (((litros - 120) / 10) * 0.05));
            valorTotalNevera = (getValorBase()) + porcentaje;
        }
        else {
            valorTotalNevera = getValorBase();
        }
        return valorTotalNevera;
    }
}
