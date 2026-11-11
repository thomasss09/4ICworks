package org.thomas;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Veicolo {
    private final String nome, marca;
    private final float peso, costo;
    private final int potenza;
    private final Date annoUscita;
    private final Patente p;

    public Veicolo(String marca, String nome, float peso, float costo, int potenza, Date annoUscita, Patente p) {
        this.nome = nome;
        this.marca = marca;
        this.peso = peso;
        this.costo = costo;
        this.potenza = potenza;
        this.annoUscita = annoUscita;
        this.p = p;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Veicolo vec && vec.getMarca().equals(marca) && vec.getNome().equals(nome) &&
                vec.getPeso() == peso && vec.getCosto() == costo && vec.getPotenza() == potenza &&
                vec.getAnnoUscita().equals(annoUscita) && vec.getP().equals(p);
    }

    public int velocitàMassima() {
        return -1;
    }

    public void rapportoPesoPotenza() {
        Float rapporto = potenza/peso;
        System.out.println("il tuo peso potenza equivale a " + rapporto );
    }

    public int punteggioQualitàPrezzo() {
        return -1;
    }

    @Override
    public String toString() {
        return " Hai scelto la " + getMarca() + getNome() + " con un peso di " + getPeso() + " kg" + " e un costo di soli " +
                getCosto() + " euro" + " , disponi di " + getPotenza() + " CV , ed e' stata creata nel " + getAnnoUscita() +
                " . Ti servira' la patente " + getP() + " per guidarla. ";
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public float getPeso() {
        return peso;
    }

    public float getCosto() {
        return costo;
    }

    public int getPotenza() {
        return potenza;
    }

    public Date getAnnoUscita() {
        return annoUscita;
    }

    public Patente getP() {
        return p;
    }
}
