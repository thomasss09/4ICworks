package org.thomas;

import java.time.Year;
import java.util.Collections;
import java.util.Map;

public class VeicoloUsato {
    private final Veicolo v;
    private StatoVeicolo state;
    private Year annoDacquisto;
    private int chilomettraggio;
    private Map<ComponentiVeicolo, StatoComponenti> statoComponenti;  // a una chiave corrisponde un valore (tipo map )

    @Override
    public boolean equals(Object obj) { // obj.equals richiede un istanza (v)
        return obj instanceof VeicoloUsato vec && vec.vettura().equals(v) &&
                vec.getState() == state && vec.getAnnoDacquisto().equals(annoDacquisto) &&
                vec.getChilomettraggio() == chilomettraggio && vec.getStatoComponenti().equals(statoComponenti);
    }

    public int getChilomettraggio() {
        return chilomettraggio;
    }

    public Year getAnnoDacquisto() {
        return annoDacquisto;
    }

    public Map<ComponentiVeicolo, StatoComponenti> getStatoComponenti() {
        return Collections.unmodifiableMap(statoComponenti);
    }

    public StatoVeicolo getState() {
        return state;
    }

    public Veicolo vettura() {
        return v;
    }

    public VeicoloUsato(Veicolo v) {
        this.v = v;
    }


}
