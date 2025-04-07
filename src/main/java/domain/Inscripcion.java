package domain;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public boolean aprobada(){ //Si se puede procesar la inscripción
        //return materias.stream().allMatch(m ->puedeInscribir(m));
        return materias.stream().allMatch(this::puedeInscribir); //Vale = que arriba
    }

    private boolean puedeInscribir(Materia materia) {
    //Puede inscribirse a una materia si el alumno aprobo todas las correlativas
        return alumno.puedeInscribirse(materia);
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }


    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}
