package org.thomas;

import javax.swing.*;
import java.util.Iterator;

class ListaDoppiamenteConcatenata<T> implements Iterable<T> {
    private int lenght = 0;

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getCoda() {
        return coda;
    }

    public void setCoda(Nodo coda) {
        this.coda = coda;
    }


    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    class Nodo {
        private T data;
        private Nodo next;
        private Nodo prec;

        public Nodo(T data) { // this.head per capirci
            this.data = data;
            this.next = null;
            this.prec = null;
        }

        public Nodo(T data, Nodo prec) { //ultimo nodo nella lista
            this.data = data;
            this.next = null;
            this.prec = prec;
        }

        // serve per lista doppiamente concatenata
        public Nodo(T data, Nodo next, Nodo prec) {
            this.prec = prec;
            this.data = data;
            this.next = next;

        }

        public void setData(T data) {
            this.data = data;
        }

        public Nodo getPrec() {
            return prec;
        }

        public void setPrec(Nodo prec) {
            this.prec = prec;
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

    private Nodo head;
    private Nodo coda;

    public ListaDoppiamenteConcatenata() {
        this.head = null;
        this.coda = null;
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

    public T get(int pos) { //estrae un elemento dalla lista
        int l = this.length();
        if (pos < 0 || pos >= l) {
            throw new IndexOutOfBoundsException("Posizione " + pos + " fuori dai limiti");
        }
        if (pos < (l / 2)) {
            Nodo scan = this.head;
            for (int i = 0; i < pos; i++) {
                scan = scan.getNext();
            }
            return scan.getData();
        } else {
            Nodo scan = this.coda;
            for (int i = 0; i < l - pos - 1; i++) {
                scan = scan.getPrec();
            }
            return scan.getData();
        }
    }

    public void insert(T element, int pos) { // agg un eleemento alla posizione richiesta
        int l = this.length();
        if (pos < 0 || pos > l) {
            throw new IndexOutOfBoundsException("Posizione " + pos + " fuori dai limiti");
        } else if (pos == 0) { // metto il nodo a testa
            this.head = new Nodo(element, this.head);
        } else if (pos == this.getLenght()) { // SE è l'elemento di coda
            Nodo n = new Nodo(element, this.coda);
            this.coda.setNext(n);
            this.coda = n;
        } else if (pos < (this.getLenght() / 2)) { // se pos è minore della metà della lunghezzza lavoro a sx
            Nodo prec = this.head;
            Nodo next = prec.getNext();
            for (int i = 0; i < pos - 1; i++) {
                prec = prec.getNext();
                next = next.getNext();
            }
            Nodo n = new Nodo(element, next.getNext(), prec.getPrec());
            prec.setPrec(n);
            next.setNext(n);
        } else if (pos > (this.getLenght() / 2)) { // se pos è maggiore della metà della lunghezzza lavoro a dx
            Nodo prec = this.coda;
            Nodo next = prec.getPrec();
            for (int j = 0; j < pos - 1; j++) {
                prec = prec.getPrec();
                next = next.getPrec();
            }
            Nodo n = new Nodo(element, next.getNext(), prec.getPrec());
            prec.setPrec(n);
            next.setNext(n);
        }
        this.setLenght(this.getLenght() + 1); // alla fine di tutto comunque allungo la lunghezza di 1 perchè ho +1 nodo
    }

    public void add(T element) {
        this.insert(element, this.length());
    }

    public void remove(int pos) { // rimuove un elemento
        int l = this.length();
        if (pos < 0 || pos >= l) {
            throw new IndexOutOfBoundsException("Posizione " + pos + " fuori dai limiti");
        } else if (l == 1) {
            this.coda = null;
            this.head = null;
        } else if (l == 2) { // elimino o il 1 elemento della lista o il 2
            if (pos == 0) {
                this.coda.setPrec(null);
                this.head = coda;
            } else {
                this.head.setNext(null);
                this.coda = head;
            }
        } else if (pos == 0) {
            this.head = this.head.getNext();
            this.head.setPrec(null);
        } else if (pos == l - 1) {
            this.coda = this.coda.getPrec();
            this.coda.setNext(null);
        } else {
            Nodo scan;
            if (pos < (l / 2)) {
                scan = this.head;
                for (int i = 0; i < pos; i++) {
                    scan = scan.getNext();
                }
            } else {
                scan = this.coda;
                for (int i = l - 1; i < pos; i--) {
                    scan = scan.getPrec();
                }
            }
            scan.getPrec().setNext(scan.getNext());
            scan.getNext().setPrec(scan.getPrec());
        }
        this.setLenght(l - 1);
    }

    public void stampaLista() { //ForEACH
        this.forEach(s -> System.out.print(s + "|"));
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private class Iteratore implements Iterator<T> {

        private Nodo cursore;

        public Iteratore() {
            this.cursore = head;
        }

        @Override
        public boolean hasNext() {
            return this.cursore != null; // vero se c'è almeno 1 elemento
        }

        @Override
        public T next() {
            T dato = this.cursore.getData();
            cursore = cursore.getNext();
            return dato;
        }
    }
}
