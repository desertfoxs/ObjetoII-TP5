package Ejercicio1.Model;

public class EmpleadoReg implements Empleado{

    private String nombre;
    private String apellido;
    private int salarioBase;

    public EmpleadoReg(String nombre, String apellido, int salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
    }

    @Override
    public float salario() {
        return salarioBase;
    }
}
