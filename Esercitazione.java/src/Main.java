public class Main {
    public static void mgain(String[] Args){
        Computer p = new Computer();
        Cella<Dispositivo> c = new Cella<>(p);
        Dispositivo d = c.estraiElemento();
        d.accendi();
    }
}
