import java.util.NoSuchElementException;

public class Cella<T> implements Contenitore<T> {
    public T elemento;

    public Cella(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public void inserisciElemento(T elemento) {
        if (elemento == null) {
            this.elemento = elemento;
        } else {
            throw new IllegalStateException("no space available");
        }
    }

    @Override
    public T estraiElemento() throws NoSuchElementException {
        if (elemento != null) {
            T estra = elemento;
            elemento = null;
            return estra;
        } else {
            throw new NoSuchElementException("no element available");
        }
    }

    @Override
    public boolean controllaVuoto() {
        if (elemento == null) {
            return false;
        } else {
            return true;
        }
    }
}
