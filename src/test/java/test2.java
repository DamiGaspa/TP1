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
        String pago = "visa";
        switch (pago) {
            case "visa":
                var visa = new Visa();
                precioTotal = visa.aplicarDescuento(mesa.calcularCostoBebidas()) + mesa.calcularCostoPlatos();
                //System.out.println(visa.aplicarDescuento(mesa.calcularCostoBebidas()));
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
        double porcentaje = 2;
        precioTotal = mesa.darPropina(precioTotal, porcentaje);
        System.out.println("Precio Total: " + precioTotal);
    }

}
