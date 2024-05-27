package Ejercicio5;

public class RemeraNacional extends Remera{


    public RemeraNacional(float costo) {
        super(costo);
    }

    @Override
    protected float recargoComercial(float costo) {
        return (float) ((costo * 0.15) + costo);
    }

    @Override
    protected float calcularPrecioImpuestos(float costo) {
        return (float) (((costo * 0.015) + costo) - ((costo * 0.2) + costo));
    }
}
