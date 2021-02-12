package co.sofka.electrodomesticos;

public class Electrodomestico {

    private String consumo;
    private String procedencia;
    private int valorConsumo;
    private int valorBase;

    public Electrodomestico(String consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
        creaPrecioBase();
    }

    public int getValorBase() {
        return valorBase;
    }

    public void creaPrecioBase() {
        switch (this.consumo) {
            case "A":
                valorConsumo = 450000;
                break;
            case "B":
                valorConsumo = 350000;
                break;
            case "C":
                valorConsumo = 250000;
                break;
            default:
                System.out.println("El valor del consumo no es correcto");
        }
        switch (this.procedencia) {
            case "Nacional":
                valorBase = valorConsumo + 250000;
                break;
            case "Importado":
                valorBase = valorConsumo + 350000;
                break;
            default:
                System.out.println("El valor de la  no es correcto");
        }
    }
}
