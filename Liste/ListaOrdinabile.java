public class ListaOrdinabile<T extends Comparable<T>> extends Lista<T> {
    private boolean isSorted;

    public ListaOrdinabile() {
        super();
        this.isSorted = true;
    }

    public void bubbleSort() {
        for (int i = 0; i < this.length(); i++) {
            for (int j = 0; j < this.length(); j++) {
                if (get(i).compareTo(get(j)) >= 0) {
                    T temp = get(j);
                    remove(j);
                    insert(temp, j);
                }
            }
        }
    }
    // TODO do la paga all'xx ; si alza in 6 di gas ; 160km/h <; 36 cv stock
    public void insertSorted(T element) {
        if (!this.isSorted) {
            bubbleSort();
        }
        int l = this.length();
        if (l == 0) {
            super.insert(element, 0);
        } else {
            int index = 0;
            while (index < l && this.get(index).compareTo(element) < 0) {
                index++;
            }
            super.insert(element, index);
        }
    }

    @Override
    public void insert(T element, int i) {
        this.isSorted = false;
        super.insert(element, i);
    }

    @Override
    public void add(T element) {
        this.isSorted = false;
        super.add(element);
    }
    
    public static void main(String[] args) {
        ListaOrdinabile<Integer> lista = new ListaOrdinabile<>();
        lista.add(2);
        lista.add(4);
        lista.add(9);
        lista.add(7);
       
        
    }
}