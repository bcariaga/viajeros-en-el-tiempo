package clases;

import java.util.ArrayList;

public class Cliente {

	private Integer envejecimiento;
	private Boolean licencia;
	private ArrayList<Viaje> viajes = new ArrayList<Viaje>();

	public Cliente(Integer envejecimiento, Boolean licencia) {

		this.envejecimiento = envejecimiento;
		this.licencia = licencia;
	}

	public Integer getCantViajes() {
		return viajes.size();
	}

	public void viajo(Viaje unViaje) {
		viajes.add(unViaje);
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

	public Integer getEnvejecimiento() {
		return envejecimiento;
	}
}


