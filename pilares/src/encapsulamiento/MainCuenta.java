package encapsulamiento;

public class MainCuenta {
    public static void main(String[] args){
        // MainCuenta
        System.out.println("Application Running MainCuenta");

        // apuntando al constructor vacio

        CuentaBancaria cuenta2 = new CuentaBancaria();

        cuenta2.setNumeroCuenta("CUENTA-002");
        cuenta2.setTitular("Elon");
        cuenta2.setSaldo(900000000);

        System.out.println("Numero de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Titular: " + cuenta2.getTitular());
        System.out.println("Saldo inicial: $" + cuenta2.getSaldo());

        System.out.println();
        System.out.println();


        CuentaBancaria cuenta1 = new CuentaBancaria("CUENTA-001", "Petroski", 100000000);

        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo inicial: $" + cuenta1.getSaldo());

        cuenta1.depositar(50000000);

        System.out.println("Saldo final: $" + cuenta1.getSaldo());


    }
}
