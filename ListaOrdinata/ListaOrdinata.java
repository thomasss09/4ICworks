public class ListaOrdinata<T extends Comparable<T>> extends Lista1<T> {

    public void insertt(T dato) {
        if (this.head == null) {
            this.head = new Nodo(dato);
            return;
        }
        Nodo temp = this.head;
        Nodo prec = null;
        while (true) {
            if (temp == null || dato.compareTo(temp.getData()) < 0) {
                break;
            }
            prec = temp;
            temp = temp.getNext();
        }
        Nodo nodo = new Nodo(dato , temp);
        if(temp != this.head){
            prec.setNext(nodo);
        }
        else{
            this.head = nodo;
        }
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
    public void print(){
        for (T e : this) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        ListaOrdinata <Integer> sc = new ListaOrdinata<>();
        sc.insertt(5);
        sc.insertt(7);
        sc.insertt(3);
        sc.insertt(1);
        sc.print();

    }
}
