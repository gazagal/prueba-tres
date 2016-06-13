package cl.curso.java.prueba_tres.gzagal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Viaje> viajes = new ArrayList<Viaje>();
        TarjetaBip tBip = new TarjetaBip(1234567890, 5000, viajes);
    	PagarViaje pagarV1 = new PagarViaje(tBip, 2000);
    	PagarViaje pagarV2 = new PagarViaje(tBip, 2000);
    	PagarViaje pagarV3 = new PagarViaje(tBip, 2000);
        
        pagarV1.start();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
        pagarV2.start();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
        pagarV3.start();
        try {
			pagarV1.join();
			pagarV2.join();
			pagarV3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        tBip.imprimir();
        
    	
    }
}
