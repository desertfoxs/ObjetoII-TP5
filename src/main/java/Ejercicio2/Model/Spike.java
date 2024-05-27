package Ejercicio2.Model;

public class Spike implements Item{

    private int tiempo;

    public Spike(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public int CalcularTiempo() {
        return tiempo;
    }
}
