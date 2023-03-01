package cuentas;

/**
 * Clase CCuenta que gestiona la consulta, ingreso y retirada de una cuenta bancaria.
 * @author cmora
 */
public class CCuenta {

/**
 * Atributos de la clase: nombre, cuenta, saldo y tipoInteres.
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método constructor.
     */
    public CCuenta()
    {
    }

    /**
     * Método contructor, inicializa a los parámetros recibidos.
     * @param nom nombre del titular.
     * @param cue cuenta.
     * @param sal saldo de la cuenta.
     * @param tipo tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Llama a getSaldo y devuelve el valor. Redundante, lo he sustituido en el
     * main por getSaldo directamente. Se puede eliminar.
     * @return saldo en la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad recibida por parámetro.
     * @param cantidad cantidad a ingresar.
     * @throws Exception en caso de que la cantidad sea negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira de la cuenta la cantidad recibida por parámetro. Controla que la cantidad
     * sea positiva y que haya saldo suficiente.
     * @param cantidad cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método get para el atributo nombre.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para el atributo nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get para el atributo cuenta
     * @return  cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método set para el atributo cuenta
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método get para el atributo saldo
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método set para el atributo saldo
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método get para el atributo tipoInteres
     * @return  tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método set para el atributo tipoInteres
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
