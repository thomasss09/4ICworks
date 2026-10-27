

/*
Il Triage
All’arrivo al Pronto Soccorso, il cittadino riceve un’immediata valutazione del livello di urgenza da parte di operatori sanitari con addestramento specifico, con l’attribuzione del codice colore che stabilisce la priorità di accesso alle cure in base alla gravità del caso e indipendentemente dall’ ordine di arrivo in ospedale.
Tale metodica è denominata “Triage” ed è finalizzata ad evitare le attese per casi urgenze. Il Triage non serve a ridurre i tempi attesi bensì a garantire che i pazienti estremamente gravi, non debbano attendere minuti preziosi per la vita.

I Codici colore

CODICE ROSSO: molto critico, pericolo di vita, priorità massima, accesso immediato alle cure.
CODICE GIALLO: mediamente critico, presenza di rischio evolutivo, potenziale pericolo di vita, prestazioni non differibili. CODICE VERDE: poco critico, assenza di rischi evolutivi, prestazioni differibili.
CODICE BIANCO: non critico, pazienti non urgenti. Se non esenti i pazienti con tale codice sono tenuti al pagamento di un ticket di € 25.
CODICE AZZURRO è assegnato ai cosiddetti “pazienti fragili”: ai ragazzi fino a 14 anni, alle persone dagli 80 anni in su, alle donne in stato di gravidanza , ai portatori di handicap e ai soggetti psichiatrici. Accede alla visite dopo i codici rossi e gialli.
[...] */


public enum  Codice {
    ROSSO(5),ARANCIONE(4),AZZURRO(3),VERDE(2),BIANCO(1);
    private final int numero;

    public int getNumero() {
        return numero;
    }
    
    Codice(int numero) {
        this.numero = numero;
    }
    
}
