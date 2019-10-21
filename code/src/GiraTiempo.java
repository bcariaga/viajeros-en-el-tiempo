
public class GiraTiempo implements Maquina{
	
	public void viajar (Cliente unCliente) {
		Integer unaCant= 3*(unCliente.getAño()-unCliente.getFinViaje());
		unCliente.setEnvejecimiento(unaCant);
		
	}
	
	public void puedeViajar (Cliente unCliente) {
		
	}

}
