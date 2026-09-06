package gestionproyectos;

public class Mago {

    private String nombre;
    private int mana;

    public Mago(String nombre, int mana) {
        this.nombre = nombre;
        this.mana = mana;
    }

    public boolean lanzarHechizo() {
        if (mana >= 10) {
            mana = mana - 10;
            return true;
        }

        return false;
    }

    public void recuperarMana(int cantidad) {
        if (cantidad > 0) {
            mana = mana + cantidad;
        }
    }
}