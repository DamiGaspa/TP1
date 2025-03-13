import org.example.Concurso;
import org.example.Inscripcion;
import org.example.Participante;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test {

    @Test
    public void test1() {
        var p1 = new Participante();
        var c1 = new Concurso();
        var inscripcion = new Inscripcion();

        inscripcion.inscribirParticipante(p1, c1);
        System.out.println("Cantidad de inscriptos: " + c1.obtenerCantidadParticipantes());

        assertTrue(c1.existeParticipante(p1));
        assertTrue(c1.obtenerCantidadParticipantes() > 0);
    }

    @Test
    public void test2() {
        var p1 = new Participante();
        var c1 = new Concurso();
        var inscripcion = new Inscripcion();

        inscripcion.inscribirParticipanteManual(p1, c1);
        System.out.println("Cantidad de inscriptos: " + c1.obtenerCantidadParticipantes());
        System.out.println("Cantidad de puntos: " + p1.getPuntos());

        assertTrue(c1.existeParticipante(p1));
        assertTrue(c1.obtenerCantidadParticipantes() > 0);
    }
}
