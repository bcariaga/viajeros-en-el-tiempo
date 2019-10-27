package clases;

public class Cliente {

	private Integer envejecimiento;
	private Boolean licencia;
	private Viaje viaje;
	private Integer cantViajes = 0;

	public Cliente(Integer envejecimiento, Boolean licencia) {

		this.envejecimiento = envejecimiento;
		this.licencia = licencia;
	}

	public Integer getCantViajes() {
		return cantViajes;
	}

	public void viajar() {
		cantViajes = cantViajes+1; //aumenta en uno cantidad de viajes
		viaje.viajar(this); //manda viaje a maquina para que valide si cumple requisitos de viaje
	}

	public void setViaje(Viaje unViaje) {
		viaje = unViaje;
	}

	public void aumentarEnvejecimiento(Integer envejecimiento) {
		this.envejecimiento += envejecimiento;
	}

	public void setLicencia(Boolean unaLicencia) {
		licencia = unaLicencia;
	}

	public Boolean getLicencia() {
		return licencia;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public Integer getEnvejecimiento() {
		return envejecimiento;
	}
}


