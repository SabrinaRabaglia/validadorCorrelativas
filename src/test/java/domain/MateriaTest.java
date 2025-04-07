package domain;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;


public class MateriaTest {
    @Test

    public void probaTieneCorrelativas() {
        Materia algebra = new Materia();
        Materia analisis1 = new Materia();
        Materia proba = new Materia();
        List<Materia> correlativasProba = new ArrayList<>();
        correlativasProba.add(algebra);
        correlativasProba.add(analisis1);
        proba.setCorrelativas(correlativasProba);
        Assertions.assertEquals(2, proba.getCorrelativas().size());
    }

    @Test
    public void discretaNoTieneCorrelativas() {
        Materia discreta = new Materia();
        Assertions.assertTrue(discreta.getCorrelativas().isEmpty());
    }

}