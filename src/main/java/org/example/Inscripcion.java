package org.example;

public class Inscripcion {
    private Concurso concurso;
    private Participante participante;

    public void inscribirParticipante (Participante participante, Concurso concurso) {
        participante.fechaInscripcion();
        if (verificarFecha(participante, concurso)) {
            participante.seInscribio();
            concurso.nuevoInscripto();
        }
        else {
            System.out.println("La fecha de inscripcion expiró.");
        }
    }

    public void inscribirParticipanteManual (Participante participante, Concurso concurso) {
        participante.fechaManual();
        if (verificarFecha(participante, concurso)) {
            participante.seInscribio();
            concurso.nuevoInscripto();
        }
        else {
            System.out.println("La fecha de inscripcion expiró.");
        }
    }

    public boolean verificarFecha (Participante participante, Concurso concurso) {
        if (participante.fechaInscripcion().isAfter(concurso.getFechaInicial()) && participante.fechaInscripcion().isBefore(concurso.getFechaFinal())) {
            participante.fechaValida();
            return true;
        }
        else {
            return false;
        }
    }
}
