package co.sofka.productos;

import co.sofka.electrodomesticos.Electrodomestico;

public class Televisor extends Electrodomestico {

    private int tamaño;
    private Boolean tdt;
    private int valorTamaño;
    private int valorTdt;
    private int valorTotalTelevision;


    public Televisor(String consumo, String procedencia, int tamaño, Boolean tdt) {
        super(consumo, procedencia);
        this.tamaño = tamaño;
        this.tdt = tdt;
        CalcularPrecioTotal();
    }

    public Integer getValorTotalTelevision() {
        return valorTotalTelevision;
    }

    public void CalcularPrecioTotal() {
        if (tamaño > 40) {
             int porcentaje = (int) Math.floor((getValorBase()) * 0.3);
             valorTamaño = (getValorBase()) + porcentaje;
        }
        else {
            valorTamaño = getValorBase();
        }
        if (tdt) {
            valorTdt = 250000;
        }
        else {
            valorTdt = 0;
        }
        valorTotalTelevision = valorTamaño + valorTdt;
    }
}
