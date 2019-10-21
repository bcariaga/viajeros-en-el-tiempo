package code.src;

public class GiraTiempo implements Maquina{

	public void viajar (Cliente unCliente) {
		Viaje viaje = unCliente.getViaje();
		unCliente.setEnvejecimiento(3 * viaje.duracion());
	}

	public Boolean puedeViajar (Cliente unCliente) {
		Viaje viaje = unCliente.getViaje();
		return viaje.viajaAlPasado();
	}

}
