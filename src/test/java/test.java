import org.example.Concurso;
import org.example.Inscripcion;
import org.example.Participante;

public class test {

    public void test1 () {
        var p1 = new Participante();
        var c1 = new Concurso();
        var inscripcion = new Inscripcion();

        inscripcion.inscribirParticipante(p1, c1);
        System.out.println("Cantidad de inscriptos: " + c1.obtenerCantidadParticipantes());
    }

    public void test2 () {
        var p1 = new Participante();
        var c1 = new Concurso();
        var inscripcion = new Inscripcion();

        inscripcion.inscribirParticipanteManual(p1, c1);
        System.out.println("Cantidad de inscriptos: " + c1.obtenerCantidadParticipantes());
    }

    public static void main(String[] args) {
        test test = new test();
        //test.test1();
        test.test2();
    }
}
