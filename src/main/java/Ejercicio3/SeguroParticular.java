package Ejercicio3;

public class SeguroParticular implements Seguro{

    public static final int HOGAR = 0;
    public final static int AUTOMOVIL = 1;
    public final static int VIDA = 2;
    public final static int MEDICOS = 3;

    private String nombre;
    private int costo;

    public SeguroParticular(String nombre, int tipoSeguro) {
        this.nombre = nombre;
        costo = costoCategoria(tipoSeguro);
    }

    private int costoCategoria(int tipoSeguro) {
        if(tipoSeguro == HOGAR){
            return 5000;
        }
        if(tipoSeguro == AUTOMOVIL){
            return 4000;
        }
        if(tipoSeguro == VIDA){
            return 3000;
        }

        //MEDICOS
        return 2000;

    }

    @Override
    public int calcularCosto() {
        return costo;
    }
}
