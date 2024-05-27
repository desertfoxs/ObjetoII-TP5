package Ejercicio2.Model;

import java.util.ArrayList;

public class Proyecto {

    ArrayList<Item> items;

    public Proyecto(ArrayList<Item> items) {
        this.items = items;
    }

    public int CalcularTiempoTotal(){

        int tiempoTotal = 0;

        for(Item item : items){
            tiempoTotal += item.CalcularTiempo();
        }

        return tiempoTotal;
    }

}
