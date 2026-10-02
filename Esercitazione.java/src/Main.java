public class Main {
    public static void m0ain(String[] Args){
        Computer p = new Computer();
        Cella<Dispositivo> c = new Cella<>(p);
        Dispositivo d = c.estraiElemento();
        d.accendi();
    }
}
