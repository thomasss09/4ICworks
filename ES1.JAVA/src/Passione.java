public class Passione {
    private String titolo;

    public Passione(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return "\"" + getTitolo() + " \"";
    }
}
