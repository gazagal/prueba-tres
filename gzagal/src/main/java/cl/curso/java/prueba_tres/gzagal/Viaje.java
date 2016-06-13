/**
 * 
 */
package cl.curso.java.prueba_tres.gzagal;

import java.util.Date;

/**
 * @author Gabriel Zagal
 *Crea y define un viaje
 */
public class Viaje implements Comparable<Viaje> {
	private Date fecha;
	private int saldoTarjeta;
	private int valorViaje;
	
	public Viaje() {
	}
	
	/**
	 * @param fecha
	 * @param saldoTarjeta
	 * @param valorViaje
	 */
	public Viaje(Date fecha, int saldoTarjeta, int valorViaje) {
		super();
		this.fecha = fecha;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the saldoTarjeta
	 */
	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}

	/**
	 * @param saldoTarjeta the saldoTarjeta to set
	 */
	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}

	/**
	 * @return the valorViaje
	 */
	public int getValorViaje() {
		return valorViaje;
	}

	/**
	 * @param valorViaje the valorViaje to set
	 */
	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}

	public int compareTo(Viaje viaje) {
		return this.getFecha().compareTo(viaje.getFecha());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Viaje [fecha=" + fecha + ", saldoTarjeta=" + saldoTarjeta + ", valorViaje=" + valorViaje + "]";
	}
	
	
}
