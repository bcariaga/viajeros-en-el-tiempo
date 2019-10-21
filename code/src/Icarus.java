
public class Icarus implements Maquina{
	
	public void viajar (Cliente unCliente) {
		Viaje viaje = cliente.getViaje();
		//envejece 30 X la cantidad de años que esta en el futuro
		unCliente.setEnvejecimiento(30 * viaje.duracion(););
		
	}
	
	public void puedeViajar (Cliente unCliente) {
		Viaje viaje = cliente.getViaje();
		return !viaje.viajaAlPasado();
	}

}
