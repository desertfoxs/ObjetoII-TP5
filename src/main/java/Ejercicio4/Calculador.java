package Ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {

    private LogTransaction log;
    private int mesEnPromocion;

    public Calculador(int mesEnPromocion) {
        this.log = new LogTransaction();
        this.mesEnPromocion = mesEnPromocion;
    }

    public final double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal = this.mesEnPromocion( precioProducto );
        } else {
            precioTotal = this.mesSinPromocion(precioProducto);
        }
        log.log(this.getClass().getName());
        return precioTotal;
    }


    protected abstract double mesSinPromocion(double preocioProducto);
    protected abstract double mesEnPromocion(double preocioProducto);

}
