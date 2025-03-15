package punto2;

public class ComarcaPlus extends TarjetaCredito {
    private double descuento;

    public ComarcaPlus() {
        this.descuento = 0.03;
    }

    public double aplicarDescuento(double precio) {
        return precio - (precio * this.descuento);
    }
}
