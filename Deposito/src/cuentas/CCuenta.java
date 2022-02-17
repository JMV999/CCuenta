package cuentas;

/**
 * 
 * @author Jaume Moreno Vallespir
 *
 */

public class CCuenta {
	
	/**
	 * nombre= nombre de la cuenta
	 * cuenta= tipo de cuenta
	 * saldo= saldod e la cuenta
	 * tipoInterés= tipo de interés de la cuenta
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Metodo constructor por defecto de la clase cuenta
     */
    public CCuenta()
    {
    }
    
    /**
     * Metodo contructor de la clase cuenta con parametros
     * @param nom Nombre de la cuenta
     * @param cue Codigo de la cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Metodo para obtener el saldo de la cuenta
     * @return Devuelve el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Metodo para ingrear dinero en la cuenta
     * @param cantidad La cantidad de dinero que se desea ingresar
     * @throws Exception Para cuando se ingresa un numero negativo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Metodo para retirar dinero
     * @param cantidad La cantidad que se desea retirar
     * @throws Exception Para cuando se retira un numero negativo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * Getter de la variable nombre
     * @return Devuelve el contenido de la variable nombre
     */
	private String getNombre() {
		return nombre;
	}
	
	/**
	 * Setter de la variable nombre
	 * @param nombre El nombre de la cuenta
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Getter de la variable cuenta
	 * @return Devuelve el contenido de la variable cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Setter de la variable cuenta
	 * @param cuenta Tipo de cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Getter de la variable saldo
	 * @return Devuelve el contenido de la varible saldo
	 */
	private double getSaldo() {
		return saldo;
	}
	
	/**
	 * Setter de la variable saldo
	 * @param saldo El saldo de la cuenta
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Getter de la variable tipoInterés
	 * @return Devuelve el contenido de la variable tipoInterés
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}
	
	/**
	 * Setter de la variabler tipoInterés
	 * @param tipoInterés El tipo de interés que se desea poner en la cuenta
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
