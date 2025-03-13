package org.example;

public class Inscripcion {
    private Concurso concurso;
    private Participante participante;

    public void inscribirParticipante(Participante participante, Concurso concurso) {
        if (verificarFecha(participante, concurso)) {
            concurso.inscribirParticipante(participante);
        } else {
            System.out.println("La fecha de inscripcion expiró.");
        }
    }

    public void inscribirParticipanteManual(Participante participante, Concurso concurso) {
        participante.fechaManual(2025, 4, 1);
        if (verificarFecha(participante, concurso)) {
            concurso.inscribirParticipante(participante);

        } else {
            System.out.println("La fecha de inscripcion expiró.");
        }
    }

    public boolean verificarFecha(Participante participante, Concurso concurso) {
        if (participante.fechaInscripcion().isAfter(concurso.getFechaInicial().plusDays(-1)) && participante.fechaInscripcion().isBefore(concurso.getFechaFinal().plusDays(1))) {
            if (fechaPorPuntos(participante, concurso)) {
                participante.sumarPuntos(10);
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean fechaPorPuntos(Participante participante, Concurso concurso) {
        if (participante.fechaInscripcion().equals(concurso.getFechaInicial())) {
            return true;
        } else {
            return false;
        }
    }

}
