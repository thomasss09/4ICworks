public class Film extends Passione implements Rapclass {

    private int annoDiUscita;
    private String titolo;
    private String nomeRegista;
    private String nomiAttoreUomo;
    private String nomiAttoreDonna;

    public Film(String titolo, int annoDiUscita, String titolo2, String nomeRegista, String nomiAttoreUomo,
            String nomiAttoreDonna) {
        super(titolo);
        this.annoDiUscita = annoDiUscita;
        titolo = titolo2;
        this.nomeRegista = nomeRegista;
        this.nomiAttoreUomo = nomiAttoreUomo;
        this.nomiAttoreDonna = nomiAttoreDonna;
    }

    @Override
    public String dicitura() {
        return titolo + " di " + nomeRegista + "starring " + nomiAttoreUomo + nomiAttoreDonna;
    }

    public int getAnnoDiUscita() {
        return annoDiUscita;
    }

    public String getNomeRegista() {
        return nomeRegista;
    }

    public String getNomiAttoreUomo() {
        return nomiAttoreUomo;
    }

    public String getNomiAttoreDonna() {
        return nomiAttoreDonna;
    }

}