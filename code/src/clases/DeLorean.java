package clases;
public class DeLorean implements Maquina{
	private Integer plutonio;

	public DeLorean(Integer plutonio) {
		this.plutonio = plutonio;
	}

	public Integer getPlutonio() {
		return plutonio;
	}

	public void viajar (Cliente unCliente) {
		this.plutonio -= cuantoPlutonioNecesita(unCliente);
	}
	public Boolean puedeViajar (Cliente unCliente) {
		return unCliente.getLicencia() && (cuantoPlutonioNecesita(unCliente) >= this.plutonio);
	}

	//solo calculo la cantidad de plutonio necesaria
	public Integer cuantoPlutonioNecesita(Cliente unCliente){
		// usamos el viaje que tiene asignado el cliente
		if(unCliente.getViaje().viajaAlPasado()){
			return 500 * unCliente.getViaje().duracion();
		}else{
			return 800 * (unCliente.getViaje().duracion() + unCliente.getViaje().salto());
		}
	}
}
