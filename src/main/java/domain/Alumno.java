package domain;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List<Materia> materias_aprobadas = new ArrayList<>();


    public boolean puedeInscribirse(Materia materia) {
        //Puede inscribirse a una materia si aprobó todas las correlativas.
        //Si en la lista de materias aprobadas están todas las correlativas
       return  materia.getCorrelativas().stream().allMatch(this::aproboMateria);
    }

    public boolean aproboMateria(Materia m) {
        return this.materias_aprobadas.contains((m));
    }

    public void setMaterias_aprobadas(List<Materia> materias_aprobadas) {
        this.materias_aprobadas = materias_aprobadas;
    }

    public List<Materia> getMaterias_aprobadas() {
        return materias_aprobadas;
    }
}
