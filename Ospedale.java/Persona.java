
import java.util.Random;

public class Persona implements Comparable<Persona> {
    private Codice codiceColore;
    private String nome;
    private int eta;
    private boolean gravidanza;
    private boolean handicap;

    public Persona(String nome, int eta, boolean gravidanza, boolean handicap) {
        this.nome = nome;
        this.eta = eta;
        this.gravidanza = gravidanza;
        this.handicap = handicap;
        setCodice();
    }


    public void setCodice(){
        if(eta < 14 || eta > 80 || gravidanza == true || handicap == true){
            codiceColore = Codice.AZZURRO;
        }
        else{
            Random random = new Random();
            int numero = random.nextInt(0,4);
            codiceColore = switch (numero) {
                case 0 -> Codice.BIANCO;
                case 1 -> Codice.VERDE;
                case 2 -> Codice.ARANCIONE;
                default -> Codice.ROSSO;
            };
        }
    }
        
    
    @Override 
    public int compareTo(Persona p1) { // confrontare i pazienti per vedere quale è più grave
        if (this.codiceColore.getNumero() > p1.codiceColore.getNumero()) {
            return -1;
        }
        else if (this.codiceColore.getNumero() == p1.codiceColore.getNumero()) {
            return 0;
        }
        return 1;
    }
    
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public Codice getCodiceColore() {
        return codiceColore;
    }


    @Override
    public String toString() {
        return "Persona [codiceColore=" + codiceColore + ", nome=" + nome + ", eta=" + eta + ", gravidanza="
                + gravidanza + ", handicap=" + handicap + "]";
    }

    
}
