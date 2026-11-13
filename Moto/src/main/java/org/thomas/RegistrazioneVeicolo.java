package org.thomas;

import java.util.Date;

//insieme di regole che permette a due programmi di comunicare tra loro
public class RegistrazioneVeicolo extends Veicolo  {// per omologare un veicolo

    public RegistrazioneVeicolo(String marca, String nome, float peso, float costo, int potenza, Date annoUscita, Patente p) {
        super(marca, nome, peso, costo, potenza, annoUscita, p);
    }


}
