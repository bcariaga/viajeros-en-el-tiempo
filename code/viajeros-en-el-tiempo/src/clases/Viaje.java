package clases;


public class Viaje{
    private Integer inicioViaje;
    private Integer finViaje;
    private Integer anoActual;
    
    //Contstructor
    public Viaje(Integer inicioViaje, Integer finViaje, Integer anoActual) {
        this.inicioViaje = inicioViaje;
        this.finViaje = finViaje;
        this.anoActual = anoActual;
    }

    public Boolean viajaAlPasado(){
        return this.anoActual > this.inicioViaje;
    }

    //necesitamos los 3 ya que cada maquina usa a�os de forma dif
    public Integer duracion(){ //dif a�o inicio y a�o de fin
        return finViaje - inicioViaje;
    }

    public Integer tiempoEnPasado(){ //tiempo en pasado
        return anoActual - inicioViaje;
    }//dif a�o de inicio a�o actual

    //cantidad de a�os que avanza al futuro
    public Integer salto(){
        return inicioViaje - anoActual;
    }
}