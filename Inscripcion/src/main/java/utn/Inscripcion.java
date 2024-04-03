package utn;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    public Alumno alumno;
    public List<Materia> materiasParaInscripcion;
    public List<Materia> materiasNecesarias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasParaInscripcion = new ArrayList<>();
        this.materiasNecesarias = new ArrayList<>();
    }

    public void setMateriasParaInscripcion(List<Materia> materiasParaInscripcion) {
        this.materiasParaInscripcion = materiasParaInscripcion;
    }

    public void setMateriasNecesarias() {
        for (Materia m : materiasParaInscripcion) {
            materiasNecesarias.addAll(m.getMateriasCorrelativas());
        }
    }

    public boolean aprobada(){
        this.setMateriasNecesarias();
        return materiasNecesarias.stream()
                .anyMatch(alumno.materiasAprobadas::contains);
    }
}
