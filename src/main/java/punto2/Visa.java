package punto2;

public class Visa extends TarjetaCredito {
    private double descuento = 0;

    public Visa() {
        this.descuento = 0.03;
    }

    public double aplicarDescuento(double precio) {
        return (precio - (precio * this.descuento));
    }
}
