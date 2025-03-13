package punto1;

import java.time.LocalDate;

public class Participante {
    private LocalDate fecha;
    private boolean inscripto;
    private int puntos;

    public Participante() {
        this.fecha = LocalDate.now();
        this.inscripto = false;
        this.puntos = 0;
    }

    public void seInscribio() {
        this.inscripto = true;
    }

    public int getPuntos() {
        return puntos;
    }

    public LocalDate fechaInscripcion() {
        return this.fecha;
    }

    public void fechaManual(int anio, int mes, int dia) {
        this.fecha = LocalDate.of(anio, mes, dia);
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }
}
