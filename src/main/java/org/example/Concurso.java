package org.example;

import java.time.LocalDateTime;

public class Concurso {
    private LocalDateTime fechaInicial;
    private LocalDateTime fechaFinal;
    private int cantidadParticipantes;

    public Concurso () {
        this.fechaInicial = LocalDateTime.of(2025, 3, 1, 12, 0);
        this.fechaFinal = LocalDateTime.of(2025, 3, 31, 12, 0);
    }

    public LocalDateTime getFechaInicial() {
        return fechaInicial;
    }

    public LocalDateTime getFechaFinal() {
        return fechaFinal;
    }

    public void establecerInicio () {
        this.fechaInicial = LocalDateTime.of(2025, 3, 1, 12, 0);
    }

    public void establecerFinal () {
        this.fechaFinal = LocalDateTime.of(2025, 3, 31, 12, 0);
    }

    public int obtenerCantidadParticipantes () {
        return this.cantidadParticipantes;
    }

    public void nuevoInscripto () {
        this.cantidadParticipantes++;
    }
}
