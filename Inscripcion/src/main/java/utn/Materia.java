package utn;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    public String nombre;
    public List<Materia> materiasCorrelativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new ArrayList<>();
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void setMateriasCorrelativas(Materia materiaCorrelativa) {
        this.materiasCorrelativas.add(materiaCorrelativa);
    }
}
