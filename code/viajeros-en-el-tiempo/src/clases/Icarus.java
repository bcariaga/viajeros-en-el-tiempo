package clases;

public class Icarus implements Maquina{

	public void viajar(Cliente unCliente, Viaje unViaje) {
		unCliente.aumentarEnvejecimiento(30 * unViaje.duracion());
		unCliente.viajo(unViaje);
	}

	public Boolean puedeViajar(Cliente unCliente, Viaje unViaje) {
		return !unViaje.viajaAlPasado(); //solo va al futuro
	}

}
