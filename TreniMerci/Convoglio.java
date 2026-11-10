

public class Convoglio {
    private Locomotiva locomotiva;
    private ListaDouble<Vagone> vagoni;

    public Convoglio(Locomotiva testa, Locomotiva coda) {
        this.vagoni = new ListaDouble<>();
        vagoni.add(testa);
        vagoni.add(coda);
    }
    
}
