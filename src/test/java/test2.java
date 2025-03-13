import org.junit.Test;
import punto2.*;

public class test2 {

    @Test
    public void test3() {
        var mesa = new Mesa();
        var b1 = new Bebida(2500);
        var p1 = new PlatoPrincipal(15000);
        mesa.getBebidas().add(b1);
        mesa.getPlatos().add(p1);
        int choose = 0;
        switch (choose) {
            case 1:
                var visa = new Visa();
                visa.aplicarDescuento(b1.getPrecio());
            case 2:
                var mastercard = new MasterCard();
                mastercard.aplicarDescuento(p1.getPrecio());
            case 3:
                var comarcaplus = new ComarcaPlus();
                comarcaplus.aplicarDescuento(mesa.calcularCostoTotal());
        }
    }

}
