package Ejercicio5;

public class RemeraImportada extends Remera{

    public RemeraImportada(float costo) {
        super(costo);
    }

    @Override
    protected float calcularPrecioImpuestos(float costo) {
        return (float) (((costo * 0.03) + costo) + ((costo * 0.05) + costo));
    }
    @Override
    protected float recargoComercial(float costo) {
        return (float) ((costo * 0.25) + costo);
    }
}