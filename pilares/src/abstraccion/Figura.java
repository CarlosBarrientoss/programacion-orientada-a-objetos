package abstraccion;

public abstract class Figura {

   protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Metodo abstracto: las hijas DEBEN implementarlo
    public abstract double calcularArea();

    public void mostrar(){
        System.out.println("Figura: " + this.nombre);
        System.out.println("Area: " + this.calcularArea());
    }
}
