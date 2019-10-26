package Test;

import clases.*;
import junit.framework.TestCase;

public class ClientsTest extends TestCase {
    Cliente hermione = new Cliente(15, false);
    Cliente marty = new Cliente(17, true);
    DeLorean deLorean = new DeLorean(5000);
    GiraTiempo giratiempo = new GiraTiempo();
    Icarus icarus = new Icarus();
    Viaje londres = new Viaje(1995, 1999, 2019, giratiempo); //para mostrar el constructor
    Viaje cuba = new Viaje(1950,1960,2019,deLorean);
    Viaje newYork= new Viaje(1999,2005,2019,giratiempo);
    Viaje tokio = new Viaje(2028,2030,2019,icarus);
    public void setUp() {

        hermione.setViaje(londres);
        marty.setViaje(cuba);//Cuba
        marty.setViaje(newYork);
        marty.setViaje(tokio);
    }

    public void testViajeHermione() {
        hermione.viajar();
        assertTrue(hermione.getViaje().tiempoEnPasado() == 24);
        assertTrue(hermione.getCantViajes() == 1);
        assertTrue(hermione.getEnvejecimiento() == 72+15);
    }

    //Le alcanza el plutonio y viaja, luego se queda sin plutonio
    public void testMartyCuba(){
        assertTrue(deLorean.getPlutonio()==5000);
        assertTrue(marty.getViaje().duracion()==10);
        assertTrue(deLorean.cuantoPlutonioNecesita(marty)==5000);
        assertTrue(deLorean.puedeViajar(marty)==true);
        marty.viajar();
        assertTrue(deLorean.getPlutonio()==0);
    }

    public void testMartyNewYork(){
        marty.viajar();
        assertTrue(marty.getViaje().tiempoEnPasado() == 20);
        assertTrue(marty.getEnvejecimiento() == 20*3+17);
    }

    public void testMartyTokio (){
        marty.viajar();
        assertTrue(marty.getViaje().duracion() == 2);
        assertTrue(marty.getEnvejecimiento()== 60+17);
    }

    public void testCantViajes (){ //Aca hacemos que viaje las 3 veces
        marty.setViaje(cuba);
        marty.viajar();
        marty.setViaje(newYork);
        marty.viajar();
        marty.setViaje(tokio);
        marty.viajar();
        assertTrue(marty.getCantViajes()==3);
    }
}

