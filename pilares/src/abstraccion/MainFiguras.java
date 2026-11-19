package abstraccion;

public class MainFiguras {

    public static void main(String[] args) {

        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(4, 5);

        c.mostrar();
        System.out.println("---");
        t.mostrar();

    }
}
