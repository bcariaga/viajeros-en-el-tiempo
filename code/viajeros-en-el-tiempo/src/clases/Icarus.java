package clases;

public class Icarus implements Maquina{

	public void viajar (Cliente unCliente) {
		unCliente.aumentarEnvejecimiento(30*unCliente.getViaje().duracion());

	}

	public Boolean puedeViajar (Cliente unCliente) {
		return ! unCliente.getViaje().viajaAlPasado();
	}

}
