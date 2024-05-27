package Ejercicio3;

import java.util.ArrayList;

public class Paquete implements Seguro{

    private double descuento = 0.05;
    private ArrayList<Seguro> seguros;

    public Paquete(ArrayList<Seguro> seguros) {
        this.seguros = seguros;
    }

    public void agregarSeguro(Seguro seguro){
        seguros.add(seguro);
    }

    @Override
    public int calcularCosto() {

        int costoTotal = 0;

        for(Seguro seguro : seguros){
            costoTotal += seguro.calcularCosto();
            costoTotal -= calcularDescuento(costoTotal);
        }

        return costoTotal;
    }

    private int calcularDescuento(int costo) {

        return (int) (costo * descuento);
    }
}
