package punto2;

public class Visa extends TarjetaCredito {
    private double descuento = 0.3;

    public Visa() {
        this.descuento = 0.3;
    }

    public double aplicarDescuento(double precio) {
        return precio - (precio * this.descuento);
    }
}
