package cuentas;

/**
 *
 * @author cmora
 */
public class Deposito {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1);
    }

    private static void operativa_cuenta(CCuenta cuenta1) {
        double saldoActual;
        saldoActual = cuenta1.getSaldo();
        System.out.printf("El saldo actual es: %.2f €\n", saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
