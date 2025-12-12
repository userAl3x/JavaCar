package org.JavaCar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class FurgonetaTest {

    @Test
    public void testCreacioFurgoneta() {
        Furgoneta furgoneta = new Furgoneta("1122JKL", "Ford", "Transit", 40, 800, null, null, "ECO");
        
        assertEquals("1122JKL", furgoneta.getMatricula());
        assertEquals("Ford", furgoneta.getMarca());
        assertEquals("Transit", furgoneta.getModel());
        assertEquals(40, furgoneta.getPrecioBase(), 0.01);
        assertEquals(800, furgoneta.getCapacidadCarga(), 0.01);
    }

    @Test
    public void testCalculPreuFurgonetaPetita() {
        Furgoneta furgoneta = new Furgoneta("3344MNO", "Mercedes", "Vito", 50, 900, null, null, "ECO");
        assertEquals(150, furgoneta.calcularPrecio(3), 0.01); // 50 * 3 = 150
    }

    @Test
    public void testCalculPreuFurgonetaGran() {
        Furgoneta furgoneta = new Furgoneta("5566PQR", "Iveco", "Daily", 55, 1200, null, null, "ECO");
        assertEquals(195, furgoneta.calcularPrecio(3), 0.01); // 55 * 3 + 10 * 3 = 195
    }

    @Test
    public void testAtributPrivat() throws NoSuchFieldException {
        // Reflexió per accedir als atributs i verificar que són privats
        Field capacidadCargaField = Furgoneta.class.getDeclaredField("capacidadCarga");


        assertTrue("L'atribut 'capacidadCarga' hauria de ser privat", 
                   java.lang.reflect.Modifier.isPrivate(capacidadCargaField.getModifiers()));
    }
}
