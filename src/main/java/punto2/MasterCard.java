package punto2;

public class MasterCard extends TarjetaCredito {
    private double descuento;

    public MasterCard() {
        this.descuento = 0.02;
    }

    public double aplicarDescuento(double precio) {
        return precio - (precio * this.descuento);
    }
}
