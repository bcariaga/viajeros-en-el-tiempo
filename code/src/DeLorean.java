
public class DeLorean implements Maquina{
	private Integer plutonio;
	
	public void viajar (Cliente unCliente) {
		this.plutonio -= cuantoPlutonioNecesita(unCliente);
	}
	public Boolean puedeViajar (Cliente unCliente) {
		unCliente.getLicencia() && cuantoPlutonioNecesita(unCliente) > this.plutonio;
	}

	//solo calculo la cantidad de plutonio necesaria
	public Integer cuantoPlutonioNecesita(Cliente unCliente){
		Viaje viaje = cliente.getViaje();
		if(viaje.viajaAlPasado()){
			500 * viaje.duracion();
		}else{
			800 * (viaje.duracion() + viaje.salto());
		}
	}
}
