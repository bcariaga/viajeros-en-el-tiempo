package code.src;

public class Viaje{
    private Integer inicioViaje;
    private Integer finViaje;
    private Integer anoActual;
    private Maquina maquina;

    public Viaje(Integer anoActual,Maquina unaMaquina){
        this.anoActual = anoActual;
        this.maquina = unaMaquina;
    }

    public Boolean viajaAlPasado(){
        return this.inicioViaje > this.finViaje;
    }

    public Maquina getMaquina(){
        return maquina;
    }

    public void viajar(Cliente unCliente){
        if(maquina.puedeViajar(unCliente)){
            maquina.viajar(unCliente);
        }
    }

    public Integer duracion(){
        if(this.viajaAlPasado()){
            return this.inicioViaje - this.finViaje;
        }else{
            return this.finViaje - this.inicioViaje;
        }
    }

    //cantidad de años que avanza al futuro
    public Integer salto(){
        return finViaje - anoActual;
    }
}