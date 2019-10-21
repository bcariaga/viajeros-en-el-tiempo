package code.src;


public class Icarus implements Maquina{

	public void viajar (Cliente unCliente) {
		Viaje viaje = unCliente.getViaje();
		//envejece 30 X la cantidad de años que esta en el futuro
		unCliente.setEnvejecimiento(30 * viaje.duracion());

	}

	public Boolean puedeViajar (Cliente unCliente) {
		Viaje viaje = unCliente.getViaje();
		return !viaje.viajaAlPasado();
	}

}
