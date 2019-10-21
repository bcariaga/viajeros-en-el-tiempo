package code.src;
public class DeLorean implements Maquina{
	private Integer plutonio;

	public void viajar (Cliente unCliente) {
		this.plutonio -= cuantoPlutonioNecesita(unCliente);
	}
	public Boolean puedeViajar (Cliente unCliente) {
		return unCliente.getLicencia() && (cuantoPlutonioNecesita(unCliente) > this.plutonio);
	}

	//solo calculo la cantidad de plutonio necesaria
	public Integer cuantoPlutonioNecesita(Cliente unCliente){
		Viaje viaje = unCliente.getViaje();
		if(viaje.viajaAlPasado()){
			return 500 * viaje.duracion();
		}else{
			return 800 * (viaje.duracion() + viaje.salto());
		}
	}
}
