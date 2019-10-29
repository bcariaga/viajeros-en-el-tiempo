package clases;

public class DeLorean implements Maquina{
	private Integer plutonio;

	public DeLorean(Integer plutonio) {
		this.plutonio = plutonio;
	}

	public Integer getPlutonio() {
		return plutonio;
	}

	public void viajar (Cliente unCliente, Viaje unViaje) {
		if(puedeViajar(unCliente, unViaje)){
			plutonio -= this.cuantoPlutonioNecesita(unCliente, unViaje);
			unCliente.viajo(unViaje);
		}
	}
	public Boolean puedeViajar (Cliente unCliente, Viaje unViaje) {
		return unCliente.getLicencia() && (this.cuantoPlutonioNecesita(unCliente, unViaje) >= this.plutonio);
	}

	//solo calculo la cantidad de plutonio necesaria
	public Integer cuantoPlutonioNecesita(Cliente unCliente, Viaje unViaje){
		// usamos el viaje que tiene asignado el cliente
		if(unViaje.viajaAlPasado()){
			return 500 * unViaje.duracion();
		}else{
			return 800 * (unViaje.duracion() + unViaje.salto());
		}
	}
}
