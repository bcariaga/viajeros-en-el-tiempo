
public class Cliente {
	private String nombre;
	private Integer envejecimiento;
	private Boolean licencia;
	private Maquina maquina;
	private Integer año=2019;
	private Integer inicioViaje;
	private Integer finViaje;
	private Integer cantViajes=0;
	
	public void viajar () {
		cantViajes+=cantViajes;
		maquina.viajar(this);
	}
	public void setMaquina(Maquina unaMaquina) {
		maquina=unaMaquina;
	}
	public void setInicioViaje(Integer añoInicio) {
		inicioViaje=añoInicio;
	}
	public Integer getInicioViaje() {
		return inicioViaje;
	}
	public void setFinViaje(Integer añoFin) {
		finViaje=añoFin;
	}
	public Integer getFinViaje() {
		return finViaje;
	}
	public Integer getAño() {
		return año;
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

}
