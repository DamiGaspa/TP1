package punto2;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private double costoTotal;
    private double costoBebidas;
    private double costoPlatos;
    private List<ItemMenu> bebidas;
    private List<ItemMenu> platos;

    public Mesa() {
        this.costoPlatos = 0;
        this.costoBebidas = 0;
        this.costoTotal = 0;
        bebidas = new ArrayList<>();
        platos = new ArrayList<>();
    }

    public double calcularCostoBebidas() {
        for (ItemMenu bebida : bebidas) {
            this.costoBebidas += bebida.obtenerPrecio();
        }
        return costoBebidas;
    }

    public double calcularCostoPlatos() {
        for (ItemMenu plato : platos) {
            this.costoPlatos += plato.obtenerPrecio();
        }
        return costoPlatos;
    }

    public double calcularCostoTotal() {
        return costoTotal = calcularCostoBebidas() + calcularCostoPlatos();
    }

    public double darPropina(double precio, double porcentaje) {
        double propina = 1 + (porcentaje / 100);
        return precio * propina;
    }

    public void sumarBebida(ItemMenu bebida) {
        bebidas.add(bebida);
    }

    public void sumarPlato(ItemMenu plato) {
        platos.add(plato);
    }

    public List<ItemMenu> getBebidas() {
        return bebidas;
    }

    public List<ItemMenu> getPlatos() {
        return platos;
    }
}
