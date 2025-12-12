package org.JavaCar;

import org.junit.Test;
import static org.junit.Assert.*;

// Classe de testos per Llogable i GestorLlogers

import java.util.ArrayList;
import java.util.List;

public class LlogableGestorTest {
    @Test
    public void testLlogableImplementacio() {
        Vehicle cotxe = new Cotxe("1234ABC", "Toyota", "Corolla", 30.0, new Motor("Gasolina", 120), new Roda("Michelin", 17), "ECO", 5);
        assertTrue(cotxe instanceof Llogable);
    }
    
    @Test
    public void testCalcularIngressosTotals() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Cotxe("1234ABC", "Toyota", "Corolla", 30.0, new Motor("Gasolina", 120), new Roda("Michelin", 17), "ECO", 5));
        vehicles.add(new Moto("5678DEF", "Yamaha", "R6", 25.0, new Motor("Gasolina", 80), new Roda("Pirelli", 16), "ECO", 600));
        assertEquals(180, GestorLlogers.calcularIngresosTotales(vehicles, 3), 0.01);
    }
}