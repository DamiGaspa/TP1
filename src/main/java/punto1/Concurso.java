package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private int cantidadParticipantes;
    private ArrayList<Participante> participantes;

    public Concurso() {
        this.participantes = new ArrayList<>();
        this.fechaInicial = LocalDate.of(2025, 3, 1);
        this.fechaFinal = LocalDate.of(2025, 3, 31);
        this.cantidadParticipantes = 0;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public int obtenerCantidadParticipantes() {
        return this.cantidadParticipantes;
    }

    public void inscribirParticipante(Participante p) {
        this.participantes.add(p);
        this.cantidadParticipantes++;
        p.seInscribio();
    }

    public boolean existeParticipante(Participante p) {
        return this.participantes.contains(p);
    }
}
