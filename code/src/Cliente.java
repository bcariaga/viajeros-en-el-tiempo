
public class Cliente {
	private String nombre;
	private Integer envejecimiento;
	private Boolean licencia;
	private Viaje viaje;
	
	private Integer cantViajes=0;
	
	public void viajar () {
		cantViajes+=cantViajes;
		Viaje.viajar(this);
	}

	public void setViaje(Viaje unaViaje) {
		viaje=unaViaje;
	}
	
	public void setLicencia (Boolean unaLicencia) {
		licencia=unaLicencia;
	}
	public Boolean getLicencia() {
		return licencia;
	}
	public void setEnvejecimiento (Integer unaCant) {
		envejecimiento=unaCant;
	}
	public Viaje getViaje(){
		return viaje;
	}

}
