public class Laptop {

    String marca;
    String modelo;
    int ram;
    int almacenamiento;
    double precio;

    public Laptop(String marca, String modelo, int ram, int almacenamiento,double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.precio=precio;
    }


    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria RAM: " + ram + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("Precio: $" + precio);
    }

    public static void main(String[] args) {

        Laptop miLaptop = new Laptop("Lenovo", "ThinkPad", 16, 512,42000000);

        miLaptop.mostrarInformacion();
    }
}