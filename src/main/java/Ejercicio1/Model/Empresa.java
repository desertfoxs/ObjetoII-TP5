package Ejercicio1.Model;

import java.util.ArrayList;

public class Empresa {

    ArrayList<Empleado> directores;

    public Empresa(ArrayList<Empleado> directores) {
        this.directores = directores;
    }

    public float calcularSalarioTotal(){

        float salarioTotal = 0;

        for(Empleado directores: directores){
            salarioTotal += directores.salario();
        }

        return salarioTotal;

    }

}
