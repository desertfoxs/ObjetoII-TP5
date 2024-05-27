package Ejercicio3;

import java.util.ArrayList;

public class Aseguradora {

    ArrayList<Seguro> seguros;

    public int CalcularCostoTotal(){
        int precioTotal = 0;

        for(Seguro seguro : seguros){
            precioTotal += seguro.calcularCosto();
        }

        return precioTotal;
    }

}
