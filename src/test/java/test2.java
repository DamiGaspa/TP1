import org.junit.Test;
import punto2.*;

import static org.junit.Assert.assertTrue;

public class test2 {

    @Test
    public void testVisa() {
        var mesa = new Mesa();
        var b1 = new ItemMenu("bebida", 2500);
        var b2 = new ItemMenu("bebida", 3000);
        var p1 = new ItemMenu("plato", 15000);
        var p2 = new ItemMenu("plato", 18000);
        var tarjeta = new Visa();
        mesa.sumarBebida(b1);
        mesa.sumarBebida(b2);
        mesa.sumarPlato(p1);
        mesa.sumarPlato(p2);
        double propina = 2;

        double precioTotal = tarjeta.aplicarDescuento(mesa.calcularCostoBebidas(), mesa.calcularCostoPlatos());
        System.out.println("Precio total: " + precioTotal);
        double precioMasPropina = mesa.darPropina(precioTotal, propina);
        System.out.println("Precio total con propina: " + precioMasPropina);

        assertTrue(precioTotal < 38500);
        assertTrue(precioMasPropina > precioTotal);
    }

    @Test
    public void testMaster() {
        var mesa = new Mesa();
        var b1 = new ItemMenu("bebida", 2500);
        var b2 = new ItemMenu("bebida", 3000);
        var p1 = new ItemMenu("plato", 15000);
        var p2 = new ItemMenu("plato", 18000);
        var tarjeta = new MasterCard();
        mesa.sumarBebida(b1);
        mesa.sumarBebida(b2);
        mesa.sumarPlato(p1);
        mesa.sumarPlato(p2);
        double propina = 3;

        double precioTotal = tarjeta.aplicarDescuento(mesa.calcularCostoBebidas(), mesa.calcularCostoPlatos());
        System.out.println("Precio total: " + precioTotal);
        double precioMasPropina = mesa.darPropina(precioTotal, propina);
        System.out.println("Precio total con propina: " + precioMasPropina);

        assertTrue(precioTotal < 38500);
        assertTrue(precioMasPropina > precioTotal);
    }

    @Test
    public void testComarca() {
        var mesa = new Mesa();
        var b1 = new ItemMenu("bebida", 2500);
        var b2 = new ItemMenu("bebida", 3000);
        var p1 = new ItemMenu("plato", 15000);
        var p2 = new ItemMenu("plato", 18000);
        var tarjeta = new ComarcaPlus();
        mesa.sumarBebida(b1);
        mesa.sumarBebida(b2);
        mesa.sumarPlato(p1);
        mesa.sumarPlato(p2);
        double propina = 5;

        double precioTotal = tarjeta.aplicarDescuento(mesa.calcularCostoBebidas(), mesa.calcularCostoPlatos());
        System.out.println("Precio total: " + precioTotal);
        double precioMasPropina = mesa.darPropina(precioTotal, propina);
        System.out.println("Precio total con propina: " + precioMasPropina);

        assertTrue(precioTotal < 38500);
        assertTrue(precioMasPropina > precioTotal);
    }

    @Test
    public void testViedma() {
        var mesa = new Mesa();
        var b1 = new ItemMenu("bebida", 2500);
        var b2 = new ItemMenu("bebida", 3000);
        var p1 = new ItemMenu("plato", 15000);
        var p2 = new ItemMenu("plato", 18000);
        var tarjeta = new Viedma();
        mesa.sumarBebida(b1);
        mesa.sumarBebida(b2);
        mesa.sumarPlato(p1);
        mesa.sumarPlato(p2);
        double propina = 5;

        double precioTotal = tarjeta.aplicarDescuento(mesa.calcularCostoBebidas(), mesa.calcularCostoPlatos());
        System.out.println("Precio total: " + precioTotal);
        double precioMasPropina = mesa.darPropina(precioTotal, propina);
        System.out.println("Precio total con propina: " + precioMasPropina);

        assertTrue(precioTotal == 38500);
        assertTrue(precioMasPropina > precioTotal);
    }

}
