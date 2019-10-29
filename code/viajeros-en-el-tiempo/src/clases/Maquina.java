package clases;

public interface Maquina {
	public void viajar (Cliente unCliente, Viaje unViaje);
	public Boolean puedeViajar (Cliente unCliente, Viaje unViaje);
}