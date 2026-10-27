



public class Main {
    public static void main(String[] args) {
        SortedList<Persona> lista = new SortedList<>();
        Persona p1 = new Persona( "Lucs", 67 , false , false);
        Persona p2 = new Persona( "Stella", 17 , false , false);
        Persona p3 = new Persona( "giacomin", 36 , false , false);
        Persona p4 = new Persona("Fona", 13 , true , true);
        lista.insertSorted(p1);
        lista.insertSorted(p2);
        lista.insertSorted(p3);
        lista.insertSorted(p4);

        lista.forEach(p -> System.out.println(p.toString()));
    }
}
