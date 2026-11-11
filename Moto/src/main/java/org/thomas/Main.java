package org.thomas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    static void main() {
        List<Veicolo> veicoli = new ArrayList<>();
        Veicolo v = new Veicolo("CITROEN" , " AMI" , 483f , 8490  , 8 , new Date(), Patente.AM );
        System.out.println(v);
    }
}
