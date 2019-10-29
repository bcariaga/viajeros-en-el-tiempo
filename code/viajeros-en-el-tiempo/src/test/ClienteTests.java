package test;

import clases.Cliente;
import clases.DeLorean;
import clases.GiraTiempo;
import clases.Icarus;
import clases.Maquina;
import clases.Viaje;

import junit.framework.TestCase;

public class ClienteTests extends TestCase {
    Integer AnioActual = 2019;
    Cliente hermione;
    Cliente marty;
    Viaje londres;
    Viaje cuba;
    Viaje newYork;
    Viaje tokio;

    public void setUp() {
        londres = new Viaje(1995, 1999, AnioActual); 
        cuba = new Viaje(1950,1960, AnioActual);
        newYork= new Viaje(1999,2005, AnioActual);
        tokio = new Viaje(2028,2030, AnioActual);
        hermione = new Cliente(15, false);
        marty = new Cliente(17, true);
    }

    public void testViajeHermione() {
        Maquina giratiempo = new GiraTiempo();
        giratiempo.viajar(hermione, londres);
        // assertTrue(hermione.getViaje().tiempoEnPasado() == 24);
        assertTrue(hermione.getCantViajes() == 1);
        assertTrue(hermione.getEnvejecimiento() == 72+15);
    }

    //Le alcanza el plutonio y viaja, luego se queda sin plutonio
    public void testMartyCuba(){
        DeLorean deLorean = new DeLorean(5000);
        deLorean.viajar(marty, cuba);
        assertTrue(marty.getCantViajes() == 1);
        assertTrue(deLorean.getPlutonio() == 0);
    }

    public void testMartyNewYork(){
        Maquina giratiempo = new GiraTiempo();
        giratiempo.viajar(marty, newYork);
        assertTrue(marty.getEnvejecimiento() == 20*3+17);
    }

    public void testMartyTokio (){
        Maquina icarus = new Icarus();
        icarus.viajar(marty, tokio);
        assertTrue(marty.getEnvejecimiento() == 60+17);
    }

    public void testCantViajes (){ //Aca hacemos que viaje las 3 veces
        Maquina icarus = new Icarus();
        icarus.viajar(marty, tokio);
        icarus.viajar(marty, newYork);
        icarus.viajar(marty, cuba);
        assertTrue(marty.getCantViajes() == 3);
    }
}

