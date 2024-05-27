package Ejercicio3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prueba {


    @Test
    public void testComprobarPrecioPaquete(){

        ArrayList<Seguro> seguros1 = new ArrayList<>();
        ArrayList<Seguro> seguros2 = new ArrayList<>();


        SeguroParticular hogar = new SeguroParticular("hogar", SeguroParticular.HOGAR);
        SeguroParticular automovil = new SeguroParticular("automovil" , SeguroParticular.AUTOMOVIL);
        SeguroParticular vida = new SeguroParticular("vida", SeguroParticular.VIDA);
        SeguroParticular medico = new SeguroParticular("medico", SeguroParticular.MEDICOS);

        seguros1.add(hogar);
        seguros1.add(automovil);
        seguros1.add(vida);
        seguros1.add(medico);

        seguros2.add(hogar);
        seguros2.add(automovil);
        seguros2.add(vida);
        seguros2.add(medico);

        Paquete paquete1 = new Paquete(seguros1);

        Paquete paqueteCompleto = new Paquete(seguros2);
        paqueteCompleto.agregarSeguro(paquete1);

        assertEquals(12111, paquete1.calcularCosto());
        assertEquals(23011, paqueteCompleto.calcularCosto());
        //preguntar porque el for each no corta aca
    }
}
