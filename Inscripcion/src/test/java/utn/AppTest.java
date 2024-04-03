package utn;

import junit.framework.Assert;
import org.junit.Test;
import utn.Materia;
import utn.Inscripcion;
import utn.Alumno;
public class InscripcionTest {
    @Test
    Materia diseño = new Materia("Diseño de Sistemas");
    Materia paradigma = new Materia("Paradigmas de Programacion");
    Materia algoritmos = new Materia("Algoritmos y Estructuras de datos");

    diseño.setMateriasCorrelativas(paradigma);

    paradigma.setMateriasCorrelativas(algoritmos);

    Alumno francisco = new Alumno(171);

    francisco.setMateriasAprobadas(algoritmos);

    public void InscripcionAceptada(){
        Inscripcion inscripcion = new Inscripcion(francisco);
        inscripcion.setMateriasParaInscripcion(paradigma);
        Assert.assertTrue(inscripcion.aprobada());
    }
    public void InscripcionRechazada(){
        Inscripcion inscripcion = new Inscripcion(francisco);
        inscripcion.setMateriasParaInscripcion(diseño);
        Assert.assertFalse(inscripcion.aprobada());
    }

}