package Ejercicio2.Model;

import java.util.ArrayList;
import java.util.List;

public class HistoriaUsuario implements Item{

    ArrayList<Item> spikes;

    public HistoriaUsuario(ArrayList<Item> spikes) {
        this.spikes = spikes;
    }

    public void agregarSpike(Spike spike){
        spikes.add(spike);
    }

    @Override
    public int CalcularTiempo() {

        int tiempo = 0;

        for(Item spike : spikes){
            tiempo += spike.CalcularTiempo();
        }

        return tiempo;
    }
}
