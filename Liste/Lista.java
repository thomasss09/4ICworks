
import java.util.Iterator;
import java.util.NoSuchElementException;

class Lista<T> implements Iterable<T>{
    class Nodo {
        private final T data;
        private Nodo next;

        public Nodo(T data) {
            this.data = data;
            this.next = null;
        }

        public Nodo(T data, Nodo next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return this.data;
        }

        public Nodo getNext() {
            return this.next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }
    }

    protected Nodo head;

    public Lista() {
        this.head = null;
    }

    public int length() {
        Nodo scan = this.head;
        int i = 0;
        while (scan != null) {
            i++;
            scan = scan.getNext();
        }
        return i;
    }

    public T get(int p) {
        int l = this.length();
        if (p < 0 || p >= l) {
            throw new IndexOutOfBoundsException("Posizione " + p + " fuori dai limiti");
        }

        else {
            Nodo scan = this.head;
            for (int i = 0; i < p; i++) {
                scan = scan.getNext();
            }

            return scan.getData();
        }
    }

    public void insert(T element, int p) {
        int l = this.length();
        if (p < 0 || p > l) {
            throw new IndexOutOfBoundsException("Posizione " + p + " fuori dai limiti");
        } else if (p == 0) {
            this.head = new Nodo(element, this.head);
        } else {
            Nodo scan = this.head;
            for (int i = 0; i < p - 1; i++) {
                scan = scan.getNext();
            }
            Nodo nuovo = new Nodo(element, scan.getNext());
            scan.setNext(nuovo);
        }
    }

    public void add(T element) {
        this.insert(element, this.length());
    }

    public void remove(int p) {
        int l = this.length();
        if (p < 0 || p >= l) {
            throw new IndexOutOfBoundsException("Posizione " + p + " fuori dai limiti");
        } else if (p == 0) {
            this.head = this.head.getNext();
        } else {
            Nodo scan = this.head;
            for (int i = 0; i < p - 1; i++) {
                scan = scan.getNext();
            }
            scan.setNext(scan.getNext().getNext());
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Nodo current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext())
                    throw new NoSuchElementException("non ce new element");
                T result = current.getData();
                current = current.getNext();
                return result;
            }
        };
    }
}
