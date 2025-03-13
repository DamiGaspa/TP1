package punto2;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private double costoTotal;
    private double costoBebidas;
    private double costoPlatos;
    private List<Bebida> bebidas;
    private List<PlatoPrincipal> platos;

    public Mesa() {
        this.costoPlatos = 0;
        this.costoBebidas = 0;
        this.costoTotal = 0;
        bebidas = new ArrayList<>();
        platos = new ArrayList<>();
    }

    public double calcularCostoBebidas(List<Bebida> bebidas) {
        for (Bebida bebida : bebidas) {
            this.costoBebidas += bebida.getPrecio();
        }
        return costoBebidas;
    }

    public double calcularCostoPlatos(List<PlatoPrincipal> platos) {
        for (PlatoPrincipal plato : platos) {
            this.costoPlatos += plato.getPrecio();
        }
        return costoPlatos;
    }

    public double calcularCostoTotal() {
        return costoTotal = costoBebidas + costoPlatos;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public List<PlatoPrincipal> getPlatos() {
        return platos;
    }
}
