package org.thomas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    static void main() {
        List<Veicolo> veicoli = new ArrayList<>();
        Veicolo v = new Veicolo("CITROEN", " AMI", 483f, 8490, 8, new Date(), Patente.AM);
        Veicolo v1 = new Veicolo("REGALIA", " TYPE D ", 2750f, 500000, 433, new Date(), Patente.B);
        Veicolo v2 = new Veicolo("KTM", " SX125", 95f, 10500, 37, new Date(), Patente.A1);
        Veicolo v3 = new Veicolo("FANTIC", " XX125 ", 90f, 8500, 36, new Date(), Patente.A1);
        System.out.println(v);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
