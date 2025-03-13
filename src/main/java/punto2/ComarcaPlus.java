package punto2;

public class ComarcaPlus extends TarjetaCredito {
    private double descuento = 0.2;

    public ComarcaPlus() {
        this.descuento = 0.3;
    }

    public double aplicarDescuento(double precio) {
        return precio - (precio * this.descuento);
    }
}
