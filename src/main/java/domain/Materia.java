package domain;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private List<Materia> correlativas = new ArrayList<>();
    //private String nombre;

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}
