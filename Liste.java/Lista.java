public class Lista<T> {
    private class Nodo {
        private final T dato;
        private Nodo succ;

        public Nodo(T dato) {
            this.dato = dato;
            this.succ = null;
        }

        public Nodo(T dato, Nodo succ) {
            this.dato = dato;
            this.succ = succ;
        }

        public T getDato() {
            return this.dato;
        }

        public Nodo getSucc() {
            return this.succ;
        }

        public void setSucc(Nodo succ) {
            this.succ = succ;
        }
    }

    private Nodo testa;

    public Lista() {
        this.testa = null;
    }

    public int length() {
        int l = 0;
        Nodo scan = this.testa;
        while (scan != null) {
            l++;
            scan = scan.getSucc();
        }
        return l;
    }

    public T get(int i) {
        Nodo scan = this.testa;
        int c = 0;
        while (scan != null || c == 0) {
            scan = scan.getSucc();
        }
        if (scan == null) {
            throw new IndexOutOfBoundsException();
        } else {
            return scan.getDato();
        }

    }
}
