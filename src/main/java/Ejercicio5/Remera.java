package Ejercicio5;

abstract class Remera {

    private float costo;
    public Remera(float costo) {
        this.costo = costo;
    }

    public final float calcularPrecio(){
        float costoFinal = 0;
        costoFinal = this.calcularPrecioImpuestos(costo);
        return costoFinal + this.recargoComercial(costo);
    }

    protected abstract float recargoComercial(float costo);
    protected abstract float calcularPrecioImpuestos(float costo);

}
