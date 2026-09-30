public class Classificabile {
    private Categoria[] elencoCategorie;

    public Classificabile() {
        this.elencoCategorie = new Categoria[3];
    }

    public boolean addCategoria(String newCategoria) {
        for (int i = 0; i < elencoCategorie.length; i++) {
            if (elencoCategorie[i] == null) {
                elencoCategorie[i] = new Categoria(newCategoria);
                return true;
            }
        }
        return false;
    }

    public boolean inserisciNuovoElemento(String idCategoria, Passione newItem, int pos) {
        for (int i = 0; i < elencoCategorie.length; i++) {
            if (elencoCategorie[i] != null && elencoCategorie[i].idCategoria.equals(idCategoria)) {
                if (pos >= 0 && pos < elencoCategorie[i].classifica.length - 1) {
                    for (int j = elencoCategorie[i].classifica.length - 1; j > pos; j--) {
                        elencoCategorie[i].classifica[j] = elencoCategorie[i].classifica[j - 1];
                    }
                    elencoCategorie[i].classifica[pos] = newItem;
                    return true;
                }
            }
        }

        return false;
    }
    public void rimuoviElemento(String idCategoria , int pos){
        for (int i = 0; i < elencoCategorie.length; i++) {
            if(elencoCategorie[i] == elencoCategorie[pos]){
                elencoCategorie[pos] = null;
            }
        }
    }
}
