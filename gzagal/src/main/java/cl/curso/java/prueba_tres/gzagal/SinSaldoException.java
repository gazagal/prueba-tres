/**
 * 
 */
package cl.curso.java.prueba_tres.gzagal;

/**
 * @author Gabriel Zagal
 *Exception para avisar que no tiene saldo
 */
public class SinSaldoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2267142864416067517L;

	/**
	 * @param message
	 * @param arg1
	 */
	public SinSaldoException(String message, Throwable arg1) {
		super(message, arg1);
	}

	/**
	 * @param message
	 */
	public SinSaldoException(String message) {
		super(message);
	}
	
	
	
}
