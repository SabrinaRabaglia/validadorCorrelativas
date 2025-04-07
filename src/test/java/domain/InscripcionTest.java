package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class InscripcionTest {

    @Test
    public void unAlumnoPuedeInscribirse(){
//Quiere anotarse a AM2 y proba, aprobo algebra y analisis1

        Alumno unAlumno = new Alumno();
        Materia analisis1 = new Materia();
        Materia analisis2 = new Materia();
        Materia algebra = new Materia();
        Materia proba = new Materia();
        List<Materia> aprobadasUnAlumno = new ArrayList<>();
        aprobadasUnAlumno.add(algebra);
        aprobadasUnAlumno.add(analisis1);
        List<Materia> correlativasProba = new ArrayList<>();
        List<Materia> correlativasAnalisis2 = new ArrayList<>();
        correlativasProba.add(analisis1);
        correlativasProba.add(algebra);
        correlativasAnalisis2.add(analisis1);
        unAlumno.setMaterias_aprobadas(aprobadasUnAlumno);
        proba.setCorrelativas(correlativasProba);
        analisis2.setCorrelativas(correlativasAnalisis2);
        Inscripcion unaInscripcion = new Inscripcion();
        unaInscripcion.setAlumno(unAlumno);
        List<Materia> materiasInscripcion = new ArrayList<>();
        materiasInscripcion.add(proba);
        materiasInscripcion.add(analisis2);
        unaInscripcion.setMaterias(materiasInscripcion);
        Assertions.assertTrue(unaInscripcion.aprobada());

    }


    @Test
    public void unAlumnoNoPuedeInscribirse(){
//Quiere anotarse a Redes y proba, aprobo comu y analisis1 y no aprobo algebra
        Alumno unAlumno = new Alumno();
        Materia analisis1 = new Materia();
        Materia algebra = new Materia();
        Materia proba = new Materia();
        Materia redes = new Materia();
        Materia comu = new Materia();
        List<Materia> aprobadasUnAlumno = new ArrayList<>();
        aprobadasUnAlumno.add(comu);
        aprobadasUnAlumno.add(analisis1);
        List<Materia> correlativasProba = new ArrayList<>();
        List<Materia> correlativasRedes = new ArrayList<>();
        correlativasProba.add(analisis1);
        correlativasProba.add(algebra);
        proba.setCorrelativas(correlativasProba);
        redes.setCorrelativas(correlativasRedes);
        correlativasRedes.add(comu);
        unAlumno.setMaterias_aprobadas(aprobadasUnAlumno);
        Inscripcion unaInscripcion = new Inscripcion();
        unaInscripcion.setAlumno(unAlumno);
        List<Materia> materiasInscripcion = new ArrayList<>();
        materiasInscripcion.add(proba);
        materiasInscripcion.add(redes);
        unaInscripcion.setMaterias(materiasInscripcion);
        Assertions.assertFalse(unaInscripcion.aprobada());
    }
}