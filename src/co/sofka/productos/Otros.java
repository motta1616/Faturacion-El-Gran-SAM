package co.sofka.productos;

import co.sofka.electrodomesticos.Electrodomestico;

public class Otros extends Electrodomestico {

    private int valorTotalOtro;

    public Otros(String consumo, String procedencia) {
        super(consumo, procedencia);
    }

    public int getValorTotalOtro() {
        return valorTotalOtro;
    }

    public void CalcularPrecioOtro() {
        valorTotalOtro = getValorBase();
    }
}
