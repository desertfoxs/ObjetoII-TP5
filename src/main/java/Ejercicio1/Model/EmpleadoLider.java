package Ejercicio1.Model;

import java.util.ArrayList;

public class EmpleadoLider implements Empleado{

    public static final int DIRECTOR = 0;
    public final static int GERENTE = 1;
    public final static int MANDOMEDIO = 2;
    public final static int LIDERPROYECT = 3;

    int TipoEmpleado;
    private String nombre;
    private String apellido;
    private int salarioBase;

    ArrayList<Empleado> empleados; //director;gerente;mandoMedio;LiderProyect;  EmpleadoReg

    public EmpleadoLider(String nombre, String apellido, int tipoEmpleado ,ArrayList<Empleado> gerentes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioCategoria(tipoEmpleado);
        this.TipoEmpleado = tipoEmpleado;
        this.empleados = gerentes;
    }

    private int salarioCategoria(int tipoEmpleado) {
        if(tipoEmpleado == DIRECTOR){
            return 5000;
        }
        if(tipoEmpleado == GERENTE){
            return 4000;
        }
        if(tipoEmpleado == MANDOMEDIO){
            return 3000;
        }

        //Lider proyecto
        return 2000;

    }

    public void addGerentes(String nombre, String apellido, Empleado gerente) {
        empleados.add(gerente);
    }

    @Override
    public float salario() {

        float sumaTotal = salarioBase;

        for(Empleado empleado: empleados){
            sumaTotal += empleado.salario();
        }

        return sumaTotal;
    }
}
