
public class Icarus implements Maquina{
	
	public void viajar (Cliente unCliente) {
		Integer unaCant=30*(unCliente.getFinViaje()-unCliente.getInicioViaje());
		unCliente.setEnvejecimiento(unaCant);
		
	}
	
	public void puedeViajar (Cliente unCliente) {
		
	}

}
