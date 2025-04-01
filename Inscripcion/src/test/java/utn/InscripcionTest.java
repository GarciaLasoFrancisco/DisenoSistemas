ppackage utn;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import utn.Materia;
import utn.Inscripcion;
import utn.Alumno;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InscripcionTest {
    @Test
    public void InscripcionAceptada() {
        Materia diseño = new Materia("Diseño de Sistemas");
        Materia paradigma = new Materia("Paradigmas de Programacion");
        Materia algoritmos = new Materia("Algoritmos y Estructuras de datos");

        diseño.setMateriasCorrelativas(paradigma);
        paradigma.setMateriasCorrelativas(algoritmos);

        Alumno francisco = new Alumno(171);
        francisco.setMateriasAprobadas(algoritmos);

        List<Materia> materias = new ArrayList<>();
        materias.add(paradigma);

        Inscripcion inscripcion = new Inscripcion(francisco);
        inscripcion.setMateriasParaInscripcion(materias);

        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void InscripcionRechazada() {
        Materia diseño = new Materia("Diseño de Sistemas");
        Materia paradigma = new Materia("Paradigmas de Programacion");
        Materia algoritmos = new Materia("Algoritmos y Estructuras de datos");

        diseño.setMateriasCorrelativas(paradigma);
        paradigma.setMateriasCorrelativas(algoritmos);

        Alumno francisco = new Alumno(171);
        francisco.setMateriasAprobadas(algoritmos);

        List<Materia> materias = new ArrayList<>();
        materias.add(diseño);

        Inscripcion inscripcion = new Inscripcion(francisco);
        inscripcion.setMateriasParaInscripcion(materias);

        assertFalse(inscripcion.aprobada());
    }
}
