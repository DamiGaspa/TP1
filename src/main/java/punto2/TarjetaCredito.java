package punto2;

public abstract class TarjetaCredito {
    private double descuento;

    public TarjetaCredito() {

    }

    public abstract double aplicarDescuento(double bebidas, double platos);

}
