package Ejercicio1;

import Ejercicio1.Model.Empleado;
import Ejercicio1.Model.EmpleadoLider;
import Ejercicio1.Model.EmpleadoReg;
import Ejercicio1.Model.Empresa;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static Ejercicio1.Model.EmpleadoLider.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prueba {

    ArrayList<Empleado> empleadosReg = new ArrayList<>();
    ArrayList<Empleado> empleadosLiderProyect = new ArrayList<>();
    ArrayList<Empleado> empleadosMandoM = new ArrayList<>();
    ArrayList<Empleado> empleadosGerente = new ArrayList<>();
    ArrayList<Empleado> empleadosDirector = new ArrayList<>();

    @Test
    public void CalculoDeSalarioTotal(){

        Empleado empleado1 = new EmpleadoReg("pepe", "lopez", 1000);
        Empleado empleado2 = new EmpleadoReg("papo", "manuel", 1000);
        empleadosReg.add(empleado1);
        empleadosReg.add(empleado2);

        Empleado empleadoLider1 = new EmpleadoLider("Angel", "Olivetti", LIDERPROYECT , empleadosReg);
        Empleado empleadoLider2 = new EmpleadoLider("ezequiel", "castillo", LIDERPROYECT , empleadosReg);
        empleadosLiderProyect.add(empleadoLider1);
        empleadosLiderProyect.add(empleadoLider2);

        Empleado empleadoMandoM = new EmpleadoLider("lucas", "tombesi", MANDOMEDIO, empleadosLiderProyect);
        empleadosMandoM.add(empleadoMandoM);

        Empleado empleadoGerente = new EmpleadoLider("valentina", "tombesi", GERENTE, empleadosMandoM);
        empleadosGerente.add(empleadoGerente);

        Empleado empleadoDirector = new EmpleadoLider("juan", "silla", DIRECTOR,empleadosGerente);
        empleadosDirector.add(empleadoDirector);

        Empresa empresa = new Empresa(empleadosDirector);


        assertEquals(20000, empresa.calcularSalarioTotal());
    }

}
