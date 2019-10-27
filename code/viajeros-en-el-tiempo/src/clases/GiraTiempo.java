package clases;

public class GiraTiempo implements Maquina{

	public void viajar (Cliente unCliente) {
		// usamos el viaje que tiene asignado el cliente
		unCliente.aumentarEnvejecimiento(3 * unCliente.getViaje().tiempoEnPasado());
	}

	public Boolean puedeViajar (Cliente unCliente) {
		// usamos el viaje que tiene asignado el cliente
		return unCliente.getViaje().viajaAlPasado();
	}

}
