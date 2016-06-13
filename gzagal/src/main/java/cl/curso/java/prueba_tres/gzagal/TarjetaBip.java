/**
 * 
 */
package cl.curso.java.prueba_tres.gzagal;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Gabriel Zagal
 *Crea y define una Tarjeta Bip
 */
public class TarjetaBip {
	private int numeroTarjeta;
	private int saldo;
	private List<Viaje> viajes;
	
	public TarjetaBip() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroTarjeta
	 * @param saldo
	 * @param viajes
	 */
	public TarjetaBip(int numeroTarjeta, int saldo, List<Viaje> viajes) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.saldo = saldo;
		this.viajes = viajes;
	}

	/**
	 * @return the numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @param numeroTarjeta the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the viajes
	 */
	public List<Viaje> getViajes() {
		return viajes;
	}

	/**
	 * @param viajes the viajes to set
	 */
	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}
	
	/**
	 * @param monto
	 * suma el monto al saldo de la tarjeta bip
	 */
	public void recargar(int monto){
		this.setSaldo(this.getSaldo()+monto);
	}
	
	/**
	 * @param valorViaje
	 * si se tiene el saldo suficiente, resta el valor del viaje al saldo
	 * y agrega un nuevo viaje a la lista de viajes.
	 * si no se tiene el saldo suficiente, se lanzara la exception
	 * SinSaldoException.
	 */
	public synchronized void pagarViaje(int valorViaje){
		if(this.getSaldo()< valorViaje){
			throw new SinSaldoException("No tiene saldo suficiente.");
		}else{
			this.setSaldo(this.getSaldo()-valorViaje);
			Viaje viaje = new Viaje(new Date(), this.getSaldo(), valorViaje);
			this.getViajes().add(viaje);
		}
	}
	
	/**
	 * imprime los datos de la Tarjeta bip y los viajes realizados en orden
	 */
	public void imprimir(){
		System.out.println("Numero de Tarjeta: "+this.getNumeroTarjeta()+"\nSaldo: "+this.getSaldo());
		Collections.sort(this.getViajes());
		for(Viaje viaje: viajes){
			System.out.println(viaje.toString());
		}
	}
}
