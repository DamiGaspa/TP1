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

    public double calcularCostoBebidas() {
        for (Bebida bebida : bebidas) {
            this.costoBebidas += bebida.getPrecio();
        }
        return costoBebidas;
    }

    public double calcularCostoPlatos() {
        for (PlatoPrincipal plato : platos) {
            this.costoPlatos += plato.getPrecio();
        }
        return costoPlatos;
    }

    public double calcularCostoTotal() {
        return costoTotal = costoBebidas + costoPlatos;
    }

    public void sumarBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public void sumarPlato(PlatoPrincipal plato) {
        platos.add(plato);
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public List<PlatoPrincipal> getPlatos() {
        return platos;
    }
}
