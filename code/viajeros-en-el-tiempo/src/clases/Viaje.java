package clases;


public class Viaje{
    private Integer inicioViaje;
    private Integer finViaje;
    private Integer anoActual;
    private Maquina maquina;

    //Contstructor


    public Viaje(Integer inicioViaje, Integer finViaje, Integer anoActual, Maquina maquina) {
        this.inicioViaje = inicioViaje;
        this.finViaje = finViaje;
        this.anoActual = anoActual;
        this.maquina = maquina;
    }

    public Boolean viajaAlPasado(){
        return this.anoActual > this.inicioViaje;
    }

    public Maquina getMaquina(){
        return maquina;
    }

    public void viajar(Cliente unCliente){
        if(maquina.puedeViajar(unCliente)){
            maquina.viajar(unCliente);
        }
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