package punto2;

public class MasterCard extends TarjetaCredito {
    private double descuento = 0.2;

    public MasterCard() {
        this.descuento = 0.2;
    }

    public double aplicarDescuento(double precio) {
        return precio - (precio * this.descuento);
    }
}
