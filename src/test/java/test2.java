import org.junit.Test;
import punto2.Bebida;
import punto2.Mesa;
import punto2.PlatoPrincipal;
import punto2.Visa;

import static org.junit.Assert.assertTrue;

public class test2 {

    @Test
    public void test3() {
        var mesa = new Mesa();
        var b1 = new Bebida(2500);
        var b2 = new Bebida(3000);
        var p1 = new PlatoPrincipal(15000);
        var p2 = new PlatoPrincipal(18000);
        var tarjeta = new Visa();
        //var tarjeta = new MasterCard();
        //var tarjeta = new ComarcaPlus();
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

}
