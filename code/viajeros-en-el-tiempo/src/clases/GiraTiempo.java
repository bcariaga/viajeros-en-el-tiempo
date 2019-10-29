package clases;

public class GiraTiempo implements Maquina{

	public void viajar(Cliente unCliente, Viaje unViaje) {
		unCliente.aumentarEnvejecimiento(3 * unViaje.tiempoEnPasado());
		unCliente.viajo(unViaje);
	}

	public Boolean puedeViajar(Cliente unCliente, Viaje unViaje) {
		return unViaje.viajaAlPasado();//puede viajar si es al pasado
	}

}
