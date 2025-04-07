package domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AlumnoTest {


    @Test
    public void unAlumnoAproboAnalisis1 (){
        Alumno unAlumno = new Alumno();
        Materia analisis1 = new Materia();
        List <Materia> aprobadasUnAlumno = new ArrayList<>();
        aprobadasUnAlumno.add(analisis1);
        unAlumno.setMaterias_aprobadas(aprobadasUnAlumno);

        Assertions.assertTrue(unAlumno.getMaterias_aprobadas().contains(analisis1));
    }

    @Test
    public void unAlumnoPuedeInscribirseAProba(){
        Alumno unAlumno = new Alumno();
        Materia analisis1 = new Materia();
        Materia algebra = new Materia();
        Materia proba = new Materia();
        List <Materia> aprobadasUnAlumno = new ArrayList<>();
        aprobadasUnAlumno.add(analisis1);
        aprobadasUnAlumno.add(algebra);
        unAlumno.setMaterias_aprobadas(aprobadasUnAlumno);
        List<Materia> correlativasProba = new ArrayList<>();
        correlativasProba.add(algebra);
        correlativasProba.add(analisis1);
        proba.setCorrelativas(correlativasProba);
        Assertions.assertTrue(unAlumno.puedeInscribirse(proba));

    }
    @Test
    public void unAlumnoNoPuedeInscribirseARedes(){
        Alumno unAlumno = new Alumno();
        Materia redes = new Materia();
        Materia comu = new Materia();
        List <Materia> aprobadasUnAlumno = new ArrayList<>();
        unAlumno.setMaterias_aprobadas(aprobadasUnAlumno);
        List<Materia> correlativasRedes = new ArrayList<>();
        correlativasRedes.add(comu);
        redes.setCorrelativas(correlativasRedes);

        Assertions.assertFalse(unAlumno.puedeInscribirse(redes));

    }

}
