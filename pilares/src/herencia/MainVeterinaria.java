package herencia;

public class MainVeterinaria {

    public static void main(String[] args) {

        Perro firulais = new Perro("firulais", 10);
        Gato michi = new Gato("Michi", 2);

        firulais.comer();
        firulais.hacerSonido();
        firulais.perseguirCola();

        System.out.println("-------");

        michi.comer();
        michi.dormir();
        michi.hacerSonido();
        michi.ronronear();

    }
}
