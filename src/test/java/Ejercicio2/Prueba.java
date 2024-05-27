package Ejercicio2;

import Ejercicio2.Model.HistoriaUsuario;
import Ejercicio2.Model.Item;
import Ejercicio2.Model.Proyecto;
import Ejercicio2.Model.Spike;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prueba {

    @Test
    public void pruebaTiempoTotal(){
        ArrayList<Item> spikes = new ArrayList<>();
        ArrayList<Item> historiaUsuarios = new ArrayList<>();

        Item spike1 = new Spike(50);
        Item spike2 = new Spike(150);
        Item spike3 = new Spike(70);
        Item spike4 = new Spike(10);

        spikes.add(spike1);
        spikes.add(spike2);
        spikes.add(spike3);
        spikes.add(spike4);

        HistoriaUsuario historiaUsuario1 = new HistoriaUsuario(spikes);
        HistoriaUsuario historiaUsuario2 = new HistoriaUsuario(spikes);

        historiaUsuarios.add(historiaUsuario1);
        historiaUsuarios.add(historiaUsuario2);

        Proyecto proyecto = new Proyecto(historiaUsuarios);

        assertEquals(560, proyecto.CalcularTiempoTotal());
    }

}
