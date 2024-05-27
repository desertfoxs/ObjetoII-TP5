package Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prueba {

    @Test
    public void calcularPrecioJubilado(){

        CalculadorJubilado caculadora = new CalculadorJubilado(4);
        assertEquals(2200, caculadora.calcularPrecio(2000));

    }

    @Test
    public void calcularPrecioNOJubilado(){

        CalculadorNoJubilado caculadora = new CalculadorNoJubilado(4);
        assertEquals(2420, caculadora.calcularPrecio(2000));

    }

}
