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
        return this.anoActual > this.finViaje;
    }

    public Maquina getMaquina(){
        return maquina;
    }

    public void viajar(Cliente unCliente){
        if(maquina.puedeViajar(unCliente)){
            maquina.viajar(unCliente);
        }
    }
    //necesitamos los 3 ya que cada maquina usa años de forma dif
    public Integer duracion(){ //dif año inicio y año de fin
        return finViaje - inicioViaje;
    }

    public Integer tiempoEnPasado(){ //tiempo en pasado
        return anoActual - inicioViaje;
    }//dif año de inicio año actual

    //cantidad de años que avanza al futuro
    public Integer salto(){
        return finViaje - anoActual;
    }
}