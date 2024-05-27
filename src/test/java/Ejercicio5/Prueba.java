package Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prueba {

    @Test
    public void pruebaCostoRemeras(){

        var remera = new RemeraImportada(500);
        assertEquals(1665.0, remera.calcularPrecio());

    }

}
