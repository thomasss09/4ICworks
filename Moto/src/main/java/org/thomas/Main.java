package org.thomas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    static void main() {
        List<Veicolo> veicoli = new ArrayList<>();
        Veicolo v = new Veicolo("CITROEN", " AMI", 483f, 8490, 8, new Date(), Patente.AM);
        Veicolo v1 = new Veicolo("REGALIA", " TYPE D ", 2750f, 500000, 433, new Date(), Patente.B);
        System.out.println(v1);
        System.out.println(v);

    }
}
