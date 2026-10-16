public class Disco implements Rapclass {
    
    private String nomeArtista;
    private int nTracce;
    private String titolo;

    public Disco( String nome, int nTracce) {
        
        this.nomeArtista = nomeArtista;
        this.nTracce = nTracce;
    }

    @Override
    public String dicitura() {
        return nomeArtista + " - " + titolo;
    }
   

    public String getNome() {
        return nomeArtista;
    }

    public int getnTracce() {
        return nTracce;
    }
}