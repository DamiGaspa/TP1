package punto2;

public abstract class TarjetaCredito {
    private double descuento;

    public TarjetaCredito() {
        this.descuento = 0;
    }

    public abstract double aplicarDescuento(double bebidas, double platos);

}
