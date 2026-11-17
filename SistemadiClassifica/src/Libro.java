public class Libro  implements Rapclass  {

    private String nomeAutore;
    private int numeroPagine;
    private String titolo;
    private String ISBN;

    public Libro(String nomeAutore, int numeroPagine, String iSBN, String titolo) {
        this.titolo = titolo;
        this.nomeAutore = nomeAutore;
        this.numeroPagine = numeroPagine;
        ISBN = iSBN;
    }

    @Override
    public String dicitura() {
        return nomeAutore + titolo + "(ISBN: " + ISBN + " )";
    }

    public String getNomeAutore() {
        return nomeAutore;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public String getISBN() {
        return ISBN;
    }
}