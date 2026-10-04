public class Main {
    public static void main(String[] Args){
        Computer p = new Computer();
        Cella<Dispositivo> c = new Cella<>(p);
        Dispositivo d = c.estraiElemento();
        d.accendi();
    }
}


// <? extends sciarpa> covarianza <? super vestito> controvarianza
// covarianza: posso usare un tipo più specifico di quello dichiarato
// controvarianza: posso usare un tipo più generico di quello dichiarato
// static binding , Dynamic binding e PECS
// lo static binding avviene a compile time, il dynamic binding avviene a runtime
// pecs: producer extends consumer super e serve a capire se un tipo generico è un produttore o un consumatore di oggetti
//l'invarianza è quando un tipo generico non può essere sostituito da un tipo più specifico o più generico di quello dichiarato
// la ricorsione serve a risolvere problemi complessi suddividendoli in problemi più semplici, e può essere implementata in Java 
// tramite metodi ricorsivi o classi ricorsive.
//Un interface è un tipo di riferimento in Java che può contenere solo costanti, dichiarazioni di metodi, metodi predefiniti, 
// metodi statici e tipi nidificati. Le interfacce non possono contenere implementazioni di metodi (fino a Java 8), ma possono essere
//  implementate da classi e altre interfacce. Una classe può implementare più interfacce, consentendo l'ereditarietà multipla dei comportamenti.
