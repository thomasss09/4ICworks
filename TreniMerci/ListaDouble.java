
import java.util.Iterator;

public class ListaDouble<T> implements Iterable<T> {

    private int lenght = 0;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public Nodo getTesta() {
        return testa;
    }

    public Nodo getCoda() {
        return coda;
    }

    protected class Nodo {

        private T dato;
        private Nodo successivo;
        private Nodo precedente;

        //costuttore per ultimo valore della lista 
        public Nodo(T dato, Nodo precedente) {
            this.dato = dato;
            this.successivo = null;
            this.precedente = precedente;
        }

        //costruttore per il primo valore della lista
        public Nodo(T dato) {
            this.dato = dato;
            this.successivo = null;
            this.precedente = null;
        }

        //costruttore per lista con dato successivo 
        public Nodo(T dato, Nodo successivo, Nodo precedente) {
            this.dato = dato;
            this.successivo = successivo;
            this.precedente = precedente;
        }

        public T getDato() {
            return this.dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public Nodo getsuccessivo() {
            return this.successivo;
        }

        public void setSuccessivo(Nodo successivo) {
            this.successivo = successivo;
        }

        public Nodo getprecedente() {
            return this.precedente;
        }

        public void setprecedente(Nodo precedente) {
            this.precedente = precedente;
        }

    }
    protected Nodo testa;
    protected Nodo coda;

    public ListaDouble() {
        this.testa = null;
        this.coda = null;
    }

    public int lenght() {
        int l = 0;
        Nodo scan = this.testa;
        while (scan != null) {
            l++;
            scan = scan.getsuccessivo();
        }
        return l;
    }
    // estrare l'elemento alla posizione i
    public T extract(int i) {
        if (i < 0 || i >= this.getLenght()) {
            throw new IndexOutOfBoundsException();
        }
        if (i < this.getLenght() / 2) {
            Nodo ext = this.testa;
            for (int j = 0; j < i; j++) {
                ext = ext.getsuccessivo();
            }
            return ext.getDato();
        } else {
            Nodo ext = this.coda;
            for (int j = 0; j < this.getLenght() - i - 1; j++) {
                ext = ext.getprecedente();
            }
            return ext.getDato();
        }
    }
    // aggiunge un elemento (dato) alla posizione i  
    public void insert(T dato, int i) {

        if (i < 0 || i > this.getLenght()) {
            throw new IndexOutOfBoundsException();
        } else if (this.getLenght() == 0) {
            Nodo n = new Nodo(dato); // 1 elemento sia testa che coda 
            this.testa = n;
            this.coda = n;

        } else if (i == 0) { // 1 elemento quindi la testa 
            Nodo n = new Nodo(dato, this.testa, null); //creo nodo dove metto dato testa e tolgo il collegamento al prec
            this.testa.setprecedente(n);// metto il nuovo nodo a testa
            this.testa = n;
        } else if (i == this.getLenght()) {  //se è all'ultima pos allora sarà la coda
            Nodo n = new Nodo(dato, this.coda);
            this.coda.setSuccessivo(n); // settiamo i alla nuova coda 
            this.coda = n;
        } else if (i < (this.getLenght() / 2)) { // se i è minore della metà della lunghezza  lavoro nella metà di sx
            Nodo prec = this.testa;
            Nodo succ = prec.getsuccessivo();
            for (int j = 0; j < i - 1; j++) {
                prec = prec.getsuccessivo();
                succ = succ.getsuccessivo();
            }
            Nodo n = new Nodo(dato, succ.getsuccessivo(), prec.getprecedente());
            succ.setSuccessivo(n);
            prec.setprecedente(n);
        } else if (i > (this.getLenght() / 2)) { // se la pos è maggiore della metà dell lunghezza lavoro nella metà di destra
            Nodo prec = this.coda;
            Nodo succ = coda.getprecedente();
            for (int j = 0; j < i - 1; j++) {
                prec = prec.getprecedente();
                succ = succ.getprecedente();
            }
            Nodo n = new Nodo(dato, succ.getsuccessivo(), prec.getprecedente());
            succ.setSuccessivo(n);
            prec.setprecedente(n);
        }
        this.setLenght(this.getLenght() + 1); //??
    }
    // aggiunge un dato alla fine della lista 
    public void add(T dato) {
        this.insert(dato, this.lenght());
    }
    // rimuove un elemento alla posizione
     public void remove(int position) {
        if (position < 0 || position >= this.getLenght()) {
            throw new IndexOutOfBoundsException("Posizione " + position + " fuori dai limiti");
        }

        else if (this.getLenght() == 1) {
            this.testa = null;
            this.coda = null;
        }

        else if (this.getLenght() == 2) {
            if (position == 0) {
                this.coda.setprecedente(null);
                this.testa = coda;
            }
            else {  // alla testa tolgo il collegamento e la metto sulla coda
                this.testa.setSuccessivo(null);
                this.coda = testa;
            }
        }

        else if (position == 0) {
            this.testa = this.testa.getsuccessivo(); // testa diventa 1
            this.testa.setprecedente(null); // 0 viene eliminato
        }
        
        else if (position == this.getLenght() - 1) {
            this.coda = this.coda.getprecedente();   // coda diventa l'elemento prima 
            this.coda.setSuccessivo(null); // imposto il numero successivo a null 
        }

        else {
            Nodo scan;
            if (position < this.getLenght() / 2) {
                scan = this.testa;
                for (int i = 0; i < position; i++) {
                    scan = scan.getsuccessivo(); // guardo tutti gli elementi fino all'elemento
                }
            }
            else {
                scan = this.coda;
                for (int i = this.getLenght() - 1; position < i; i--) {
                    scan = scan.getprecedente();
                }
            }
            scan.getprecedente().setSuccessivo(scan.getsuccessivo());
            scan.getsuccessivo().setprecedente(scan.getprecedente());
        }
        this.setLenght(this.getLenght()-1);
    }

    public void stampaLista() { //ForEACH 
        this.forEach(s -> System.out.print(s + "|"));

    }

    @Override
    public Iterator<T> iterator() { // Iteratore
        return new Iteratore();
    }

    protected class Iteratore implements Iterator<T> {

        private Nodo cursore;

        public Iteratore() {
            cursore = testa;
        }

        @Override
        public boolean hasNext() {
            return cursore != null;
        }

        @Override
        public T next() {
            T e = cursore.getDato();
            cursore = cursore.getsuccessivo();
            return e;
        }

    }

    public static void main(String[] args) { // main 
        ListaDouble<Integer> ints = new ListaDouble<>();
        ints.add(5);
        ints.insert(100, 0);
        ints.add(230);
        ints.add(6);
        ints.add(192);
        System.out.println(ints.extract(2));

        ints.remove(1);

        ints.stampaLista();
    }
}