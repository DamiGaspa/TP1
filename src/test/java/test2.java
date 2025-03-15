import org.junit.Test;
import punto2.*;

public class test2 {

    @Test
    public void test3() {
        var mesa = new Mesa();
        var b1 = new Bebida(2500);
        var p1 = new PlatoPrincipal(15000);
        mesa.sumarBebida(b1);
        mesa.sumarPlato(p1);
        double precioTotal = 0;
        double porcentaje = 2;
        String pago = "comarcaplus";

        switch (pago) {
            case "visa":
                var visa = new Visa();
                precioTotal = visa.aplicarDescuento(mesa.calcularCostoBebidas()) + mesa.calcularCostoPlatos();
                break;
            case "mastercard":
                var mastercard = new MasterCard();
                precioTotal = mastercard.aplicarDescuento(mesa.calcularCostoPlatos()) + mesa.calcularCostoBebidas();
                break;
            case "comarcaplus":
                var comarcaplus = new ComarcaPlus();
                precioTotal = comarcaplus.aplicarDescuento(mesa.calcularCostoTotal());
                break;
        }
        System.out.println("Al aplicar el descuento por pago con tarjeta " + pago.toUpperCase() + ", el costo total será: $" + precioTotal);
        precioTotal = mesa.darPropina(precioTotal, porcentaje);
        System.out.println("Al dejar una propia del " + porcentaje + "%, el costo final será: $" + precioTotal);


    }

}
