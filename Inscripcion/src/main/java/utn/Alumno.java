package utn;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    public Integer legajo;
    public List<Materia> materiasAprobadas;

    public Alumno(Integer legajo) {
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void setMateriasAprobadas(Materia materiaAprobada) {
        this.materiasAprobadas.add(materiaAprobada);
    }
}
