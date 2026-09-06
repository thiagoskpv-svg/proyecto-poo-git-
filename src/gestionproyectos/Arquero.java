package gestionproyectos;

public class Arquero extends Tarea {

    private String nombre;
    private int cantidadFlechas;

    public Arquero(String nombre, int cantidadFlechas) {
        this.nombre = nombre;
        this.cantidadFlechas = cantidadFlechas;
    }

    public boolean dispararFlecha() {
        if (cantidadFlechas > 0) {
            cantidadFlechas--;
            return true;
        }

        return false;
    }
}